package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18402e extends BaseAdapter {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17757e f36087e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f36088e = -1;

    public C18402e(C17757e c17757e) {
        this.f36087e = c17757e;
        ad();
    }

    public final void ad() {
        MenuC8939e menuC8939e = this.f36087e.f34825e;
        C9995e c9995e = menuC8939e.f17939e;
        if (c9995e != null) {
            menuC8939e.startapp();
            ArrayList arrayList = menuC8939e.f17929e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C9995e) arrayList.get(i)) == c9995e) {
                    this.f36088e = i;
                    return;
                }
            }
        }
        this.f36088e = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C17757e c17757e = this.f36087e;
        MenuC8939e menuC8939e = c17757e.f34825e;
        menuC8939e.startapp();
        int size = menuC8939e.f17929e.size();
        c17757e.getClass();
        return this.f36088e < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f36087e.f34826e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2530e) view).metrica(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        ad();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final C9995e getItem(int i) {
        C17757e c17757e = this.f36087e;
        MenuC8939e menuC8939e = c17757e.f34825e;
        menuC8939e.startapp();
        ArrayList arrayList = menuC8939e.f17929e;
        c17757e.getClass();
        int i2 = this.f36088e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C9995e) arrayList.get(i);
    }
}
