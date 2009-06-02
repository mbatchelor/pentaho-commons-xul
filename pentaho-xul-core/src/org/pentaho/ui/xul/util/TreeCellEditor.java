package org.pentaho.ui.xul.util;

public interface TreeCellEditor {

  public void setValue(Object val);
  
  public Object getValue();
  
  public void show();
  
  public void hide();
  
  public void addTreeCellEditorListener(TreeCellEditorListener listener);
}
