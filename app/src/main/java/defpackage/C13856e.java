package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13856e extends BaseAdapter {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LayoutInflater f27438e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f27439e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f27440e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f27441e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final MenuC8939e f27442e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f27443e;

    public C13856e(MenuC8939e menuC8939e, LayoutInflater layoutInflater, boolean z, int i) {
        this.f27441e = z;
        this.f27438e = layoutInflater;
        this.f27442e = menuC8939e;
        this.f27443e = i;
        ad();
    }

    public final void ad() {
        MenuC8939e menuC8939e = this.f27442e;
        C9995e c9995e = menuC8939e.f17939e;
        if (c9995e != null) {
            menuC8939e.startapp();
            ArrayList arrayList = menuC8939e.f17929e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C9995e) arrayList.get(i)) == c9995e) {
                    this.f27440e = i;
                    return;
                }
            }
        }
        this.f27440e = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList advert;
        boolean z = this.f27441e;
        MenuC8939e menuC8939e = this.f27442e;
        if (z) {
            menuC8939e.startapp();
            advert = menuC8939e.f17929e;
        } else {
            advert = menuC8939e.advert();
        }
        return this.f27440e < 0 ? advert.size() : advert.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f27438e.inflate(this.f27443e, viewGroup, false);
        }
        int i2 = getItem(i).f19730e;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f19730e : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f27442e.smaato() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC2530e interfaceC2530e = (InterfaceC2530e) view;
        if (this.f27439e) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2530e.metrica(getItem(i));
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
        ArrayList advert;
        boolean z = this.f27441e;
        MenuC8939e menuC8939e = this.f27442e;
        if (z) {
            menuC8939e.startapp();
            advert = menuC8939e.f17929e;
        } else {
            advert = menuC8939e.advert();
        }
        int i2 = this.f27440e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C9995e) advert.get(i);
    }
}
