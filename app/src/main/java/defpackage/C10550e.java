package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10550e implements InterfaceC16827e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2547e f20828e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f20829e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function0 f20830e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17210e f20831e;

    public C10550e(C17210e c17210e, int i, C2547e c2547e, Function0 function0) {
        this.f20831e = c17210e;
        this.f20829e = i;
        this.f20828e = c2547e;
        this.f20830e = function0;
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.license(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.purchase(this, abstractC9292e, interfaceC16719e, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10550e)) {
            return false;
        }
        C10550e c10550e = (C10550e) obj;
        return AbstractC7890e.billing(this.f20831e, c10550e.f20831e) && this.f20829e == c10550e.f20829e && AbstractC7890e.billing(this.f20828e, c10550e.f20828e) && AbstractC7890e.billing(this.f20830e, c10550e.f20830e);
    }

    public final int hashCode() {
        return this.f20830e.hashCode() + ((this.f20828e.hashCode() + (((this.f20831e.hashCode() * 31) + this.f20829e) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC16827e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        long j2;
        if (interfaceC16719e.loadAd(C5602e.billing(j)) < C5602e.yandex(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C5602e.ad(0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13, j2);
        }
        AbstractC2832e admob = interfaceC16719e.admob(j);
        int min = Math.min(admob.f6806e, C5602e.yandex(j2));
        return interfaceC13158e.ads(min, admob.f6804e, C9139e.f18290e, new C5888e(min, 1, this, interfaceC13158e, admob));
    }

    @Override // defpackage.InterfaceC12864e
    public final /* synthetic */ InterfaceC12864e premium(InterfaceC12864e interfaceC12864e) {
        return AbstractC5087e.isVip(this, interfaceC12864e);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.vip(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC16827e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.yandex(this, abstractC9292e, interfaceC16719e, i);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f20831e + ", cursorOffset=" + this.f20829e + ", transformedText=" + this.f20828e + ", textLayoutResultProvider=" + this.f20830e + ')';
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
