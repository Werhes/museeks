package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11504e extends AbstractC6126e implements InterfaceC17303e, InterfaceC8501e, InterfaceC9629e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C6284e f23112e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C2752e f23113e;

    public C11504e(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C2752e c2752e) {
        this.f23113e = c2752e;
        C6284e c6284e = new C6284e(c10566e, c1839e, interfaceC2141e, function1, i, z, i2, i3, list, function12, c2752e, null);
        m2050e(c6284e);
        this.f23112e = c6284e;
        if (this.f23113e == null) {
            throw AbstractC5087e.m1749interface("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f23112e.ad(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f23112e.billing(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        this.f23112e.mo294e(c4017e);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        return this.f23112e.license(interfaceC13158e, interfaceC16719e, j);
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f23112e.purchase(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return this.f23112e.startapp(abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        C2752e c2752e = this.f23113e;
        if (c2752e != null) {
            c2752e.f6662e = C18540e.applovin(c2752e.f6662e, interfaceC0043e, null, 2);
            C0971e c0971e = c2752e.f6661e;
            long j = c2752e.f6663e;
            c0971e.ad = false;
            C16784e c16784e = c0971e.appmetrica;
            if (c16784e != null) {
                c16784e.invoke(Long.valueOf(j));
            }
        }
    }
}
