package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6221e implements InterfaceC16827e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2547e f13003e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13004e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function0 f13005e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17210e f13006e;

    public C6221e(C17210e c17210e, int i, C2547e c2547e, Function0 function0) {
        this.f13006e = c17210e;
        this.f13004e = i;
        this.f13003e = c2547e;
        this.f13005e = function0;
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
        if (!(obj instanceof C6221e)) {
            return false;
        }
        C6221e c6221e = (C6221e) obj;
        return AbstractC7890e.billing(this.f13006e, c6221e.f13006e) && this.f13004e == c6221e.f13004e && AbstractC7890e.billing(this.f13003e, c6221e.f13003e) && AbstractC7890e.billing(this.f13005e, c6221e.f13005e);
    }

    public final int hashCode() {
        return this.f13005e.hashCode() + ((this.f13003e.hashCode() + (((this.f13006e.hashCode() * 31) + this.f13004e) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC16827e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7, j));
        int min = Math.min(admob.f6804e, C5602e.billing(j));
        return interfaceC13158e.ads(admob.f6806e, min, C9139e.f18290e, new C16202e(this, admob, min, 9));
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f13006e + ", cursorOffset=" + this.f13004e + ", transformedText=" + this.f13003e + ", textLayoutResultProvider=" + this.f13005e + ')';
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
