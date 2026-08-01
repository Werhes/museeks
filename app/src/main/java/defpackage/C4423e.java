package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۠ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4423e extends AbstractC14533e {
    public final /* synthetic */ Object adcel;
    public final /* synthetic */ Serializable mopub;
    public final /* synthetic */ int startapp;

    public C4423e(C4246e c4246e, Function1 function1) {
        this.startapp = 1;
        this.mopub = c4246e;
        this.adcel = function1;
    }

    public /* synthetic */ C4423e(Object obj, Serializable serializable, int i) {
        this.startapp = i;
        this.adcel = obj;
        this.mopub = serializable;
    }

    @Override // defpackage.AbstractC14533e
    public void ad(Object obj) {
        switch (this.startapp) {
            case 1:
                InterfaceC0390e interfaceC0390e = (InterfaceC0390e) obj;
                C4246e c4246e = (C4246e) this.mopub;
                if (c4246e.f9318e == null && ((Boolean) ((Function1) this.adcel).invoke(interfaceC0390e)).booleanValue()) {
                    c4246e.f9318e = interfaceC0390e;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC14533e
    public final Object advert() {
        switch (this.startapp) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.mopub)[0]);
            case 1:
                return (InterfaceC0390e) ((C4246e) this.mopub).f9318e;
            default:
                EnumC1830e enumC1830e = (EnumC1830e) ((C4246e) this.mopub).f9318e;
                return enumC1830e == null ? EnumC1830e.f4925e : enumC1830e;
        }
    }

    @Override // defpackage.AbstractC14533e
    public final boolean vip(Object obj) {
        int i = this.startapp;
        Object obj2 = this.adcel;
        Object obj3 = this.mopub;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((Function1) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                return ((C4246e) obj3).f9318e == null;
            default:
                InterfaceC5052e interfaceC5052e = (InterfaceC5052e) obj;
                C4246e c4246e = (C4246e) obj3;
                String str = (String) obj2;
                String str2 = C0696e.ad;
                C11709e billing = C0696e.billing(AbstractC2876e.billing(interfaceC5052e).ad);
                String tapsense = AbstractC0869e.tapsense('.', billing != null ? C1553e.appmetrica(billing) : AbstractC9164e.license(interfaceC5052e, C17354e.f34038e), str);
                if (C17405e.vip.contains(tapsense)) {
                    c4246e.f9318e = EnumC1830e.f4926e;
                } else if (C17405e.license.contains(tapsense)) {
                    c4246e.f9318e = EnumC1830e.f4924e;
                } else if (C17405e.metrica.contains(tapsense)) {
                    c4246e.f9318e = EnumC1830e.f4923e;
                } else if (C17405e.ad.contains(tapsense)) {
                    c4246e.f9318e = EnumC1830e.f4922e;
                }
                return c4246e.f9318e == null;
        }
    }
}
