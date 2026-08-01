package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9712e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15671e f19213e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19214e;

    public /* synthetic */ C9712e(InterfaceC15671e interfaceC15671e, int i) {
        this.f19214e = i;
        this.f19213e = interfaceC15671e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        switch (this.f19214e) {
            case 0:
                C5829e c5829e = (C5829e) ((InterfaceC6459e) obj);
                c5829e.f12290e = true;
                c5829e.f12289e.invoke(this.f19213e);
                AbstractC15118e.appmetrica(c5829e);
                return Boolean.FALSE;
            case 1:
                Boolean ad = ((C13333e) ((InterfaceC18157e) obj)).ad();
                if (ad != null) {
                    AbstractC14594e.loadAd(this.f19213e, ad.booleanValue() ? EnumC9470e.f18811e : EnumC9470e.f18809e);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Boolean ad2 = ((C13333e) ((InterfaceC18157e) obj)).ad();
                if (ad2 != null) {
                    AbstractC14594e.loadAd(this.f19213e, ad2.booleanValue() ? EnumC9470e.f18811e : EnumC9470e.f18809e);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
