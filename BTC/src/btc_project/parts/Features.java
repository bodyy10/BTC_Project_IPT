package btc_project.parts;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;



public class Features {

	Button button_create;
	Button button_display_all;
	Button button_display_single;
	Button button_edit;
	Label label_name;
	Label label_sh_desc;
	Label label_lg_desc;
	Text text_name;
	Text text_sh_desc;
	Text text_lg_desc;
	
	@PostConstruct
	public void create(Composite parent)
	{
		label_name = new Label(parent, SWT.BORDER);
		label_name.setText("Name");
		text_name = new Text(parent, SWT.BORDER);
		
		label_sh_desc = new Label(parent, SWT.BORDER);
		label_sh_desc.setText("Short description");
		text_sh_desc = new Text(parent, SWT.BORDER);
		
		label_lg_desc = new Label(parent, SWT.BORDER);
		label_lg_desc.setText("Long description");
		text_lg_desc = new Text(parent, SWT.BORDER);
		
		button_create = new Button(parent, SWT.BORDER);
		button_create.setText("Create new");
		button_create.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				PersistenceUtility.getInstance().create(new Requirement(text_name.getText(),text_sh_desc.getText(),text_lg_desc.getText()));
				text_name.setText("");
				text_sh_desc.setText("");
				text_lg_desc.setText("");
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		button_edit = new Button(parent, SWT.BORDER);
		button_edit.setText("Edit");
		button_edit.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		
		//
		
		
		
		
		
		
		//
		
	}
	
}
