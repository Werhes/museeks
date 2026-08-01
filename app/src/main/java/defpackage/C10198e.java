package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10198e implements InterfaceC16522e {
    public final long ad;

    public C10198e(long j) {
        this.ad = j;
        if (j != 16) {
            return;
        }
        AbstractC5525e.ad("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.InterfaceC16522e
    public final float ad() {
        return C3618e.license(this.ad);
    }

    @Override // defpackage.InterfaceC16522e
    public final AbstractC4457e appmetrica() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10198e) && C3618e.metrica(this.ad, ((C10198e) obj).ad);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.ad);
    }

    @Override // defpackage.InterfaceC16522e
    public final /* synthetic */ InterfaceC16522e license(InterfaceC16522e interfaceC16522e) {
        return AbstractC1786e.purchase(this, interfaceC16522e);
    }

    @Override // defpackage.InterfaceC16522e
    public final InterfaceC16522e metrica(Function0 function0) {
        return !equals(C0925e.ad) ? this : (InterfaceC16522e) function0.invoke();
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C3618e.startapp(this.ad)) + ')';
    }

    @Override // defpackage.InterfaceC16522e
    public final long vip() {
        return this.ad;
    }
}
