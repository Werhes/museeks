package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17757e implements InterfaceC17868e, AdapterView.OnItemClickListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC17386e f34824e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public MenuC8939e f34825e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public LayoutInflater f34826e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ExpandedMenuView f34827e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Context f34828e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C18402e f34829e;

    public C17757e(ContextWrapper contextWrapper) {
        this.f34828e = contextWrapper;
        this.f34826e = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean appmetrica(C9995e c9995e) {
        return false;
    }

    @Override // defpackage.InterfaceC17868e
    public final void billing(InterfaceC17386e interfaceC17386e) {
        throw null;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean license() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eٗۤۙ, android.content.DialogInterface$OnClickListener, java.lang.Object, eٖ٘ۢ, android.content.DialogInterface$OnDismissListener] */
    @Override // defpackage.InterfaceC17868e
    public final boolean metrica(SubMenuC1355e subMenuC1355e) {
        boolean hasVisibleItems = subMenuC1355e.hasVisibleItems();
        Context context = subMenuC1355e.f17945e;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f31979e = subMenuC1355e;
        C13572e c13572e = new C13572e(context);
        C11486e c11486e = (C11486e) c13572e.f26878e;
        C17757e c17757e = new C17757e(c11486e.ad);
        obj.f31977e = c17757e;
        c17757e.f34824e = obj;
        subMenuC1355e.vip(c17757e, context);
        C17757e c17757e2 = obj.f31977e;
        if (c17757e2.f34829e == null) {
            c17757e2.f34829e = new C18402e(c17757e2);
        }
        c11486e.amazon = c17757e2.f34829e;
        c11486e.loadAd = obj;
        View view = subMenuC1355e.f17935e;
        if (view != null) {
            c11486e.appmetrica = view;
        } else {
            c11486e.metrica = subMenuC1355e.f17931e;
            c11486e.license = subMenuC1355e.f17926e;
        }
        c11486e.smaato = obj;
        DialogInterfaceC15370e amazon = c13572e.amazon();
        obj.f31978e = amazon;
        amazon.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f31978e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f31978e.show();
        InterfaceC17386e interfaceC17386e = this.f34824e;
        if (interfaceC17386e == null) {
            return true;
        }
        interfaceC17386e.smaato(subMenuC1355e);
        return true;
    }

    @Override // defpackage.InterfaceC17868e
    public final void mopub(Context context, MenuC8939e menuC8939e) {
        if (this.f34828e != null) {
            this.f34828e = context;
            if (this.f34826e == null) {
                this.f34826e = LayoutInflater.from(context);
            }
        }
        this.f34825e = menuC8939e;
        C18402e c18402e = this.f34829e;
        if (c18402e != null) {
            c18402e.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f34825e.admob(this.f34829e.getItem(i), this, 0);
    }

    @Override // defpackage.InterfaceC17868e
    public final void startapp() {
        C18402e c18402e = this.f34829e;
        if (c18402e != null) {
            c18402e.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
        InterfaceC17386e interfaceC17386e = this.f34824e;
        if (interfaceC17386e != null) {
            interfaceC17386e.vip(menuC8939e, z);
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean yandex(C9995e c9995e) {
        return false;
    }
}
