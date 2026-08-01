package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2299e implements InterfaceC8960e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f5812e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f5813e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f5814e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13475e f5815e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC12141e f5816e;

    static {
        C12156e c12156e = new C12156e(C2299e.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f5812e = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C2299e.class, "annotations", "getAnnotations()Ljava/util/List;", 0, c12232e)};
    }

    public C2299e(AbstractC12141e abstractC12141e, int i, int i2, Function0 function0) {
        this.f5816e = abstractC12141e;
        this.f5814e = i;
        this.f5813e = i2;
        this.f5815e = AbstractC2426e.vip(null, function0);
        AbstractC2426e.vip(null, new C14370e(this, 0));
    }

    public final InterfaceC12132e adcel() {
        InterfaceC8614e interfaceC8614e = f5812e[0];
        return (InterfaceC12132e) this.f5815e.invoke();
    }

    public final boolean admob() {
        InterfaceC12132e adcel = adcel();
        return (adcel instanceof C13043e) && ((C13043e) adcel).f25971e != null;
    }

    public final C12011e advert() {
        return new C12011e(adcel().ad(), new C14370e(this, 1), false);
    }

    public final boolean amazon() {
        InterfaceC12132e adcel = adcel();
        C13043e c13043e = adcel instanceof C13043e ? (C13043e) adcel : null;
        if (c13043e != null) {
            return AbstractC2876e.ad(c13043e);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8960e)) {
            return false;
        }
        C2299e c2299e = (C2299e) ((InterfaceC8960e) obj);
        return AbstractC7890e.billing(this.f5816e, c2299e.f5816e) && this.f5814e == c2299e.f5814e;
    }

    public final String getName() {
        InterfaceC12132e adcel = adcel();
        C13043e c13043e = adcel instanceof C13043e ? (C13043e) adcel : null;
        if (c13043e != null && !c13043e.m3523e().mo328e()) {
            C0520e name = c13043e.getName();
            if (!name.f2666e) {
                return name.vip();
            }
        }
        return null;
    }

    public final int hashCode() {
        return (this.f5816e.hashCode() * 31) + this.f5814e;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        int m2467class = AbstractC8703e.m2467class(this.f5813e);
        if (m2467class == 0) {
            sb2.append("instance parameter");
        } else if (m2467class == 1) {
            sb2.append("context parameter " + getName());
        } else if (m2467class == 2) {
            sb2.append("extension receiver parameter");
        } else {
            if (m2467class != 3) {
                throw new C14803e(10);
            }
            sb2.append("parameter #" + this.f5814e + ' ' + getName());
        }
        sb2.append(" of ");
        Object obj = this.f5816e;
        if (obj instanceof InterfaceC8614e) {
            InterfaceC8614e interfaceC8614e = (InterfaceC8614e) obj;
            StringBuilder sb3 = new StringBuilder();
            C1400e.applovin(sb3, interfaceC8614e);
            sb3.append(interfaceC8614e instanceof InterfaceC3996e ? "var " : "val ");
            C1400e.premium(sb3, interfaceC8614e);
            C1400e.ads(interfaceC8614e.getName(), sb3);
            sb3.append(": ");
            sb3.append(C1400e.m597class(interfaceC8614e.inmobi(), false));
            sb = sb3.toString();
        } else {
            if (!(obj instanceof InterfaceC5261e)) {
                throw new IllegalStateException(("Illegal callable: " + obj).toString());
            }
            InterfaceC5261e interfaceC5261e = (InterfaceC5261e) obj;
            StringBuilder sb4 = new StringBuilder();
            C1400e.applovin(sb4, interfaceC5261e);
            sb4.append("fun ");
            C1400e.premium(sb4, interfaceC5261e);
            C1400e.ads(interfaceC5261e.getName(), sb4);
            AbstractC13480e.m3610while(AbstractC2803e.mopub(interfaceC5261e), sb4, ", ", "(", ")", C8865e.f17813e, 48);
            sb4.append(": ");
            sb4.append(C1400e.m597class(interfaceC5261e.inmobi(), false));
            sb = sb4.toString();
        }
        sb2.append(sb);
        return sb2.toString();
    }
}
