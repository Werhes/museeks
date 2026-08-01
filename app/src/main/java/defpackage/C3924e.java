package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3924e implements InterfaceC16154e, InterfaceC5606e {
    public final InterfaceC1230e ad;
    public final InterfaceC1230e license;
    public final InterfaceC1230e metrica;
    public final InterfaceC1230e vip;

    public C3924e(InterfaceC1230e interfaceC1230e, InterfaceC1230e interfaceC1230e2, InterfaceC1230e interfaceC1230e3, InterfaceC1230e interfaceC1230e4) {
        this.ad = interfaceC1230e;
        this.vip = interfaceC1230e2;
        this.metrica = interfaceC1230e3;
        this.license = interfaceC1230e4;
    }

    public static C3924e metrica(C3924e c3924e, InterfaceC1230e interfaceC1230e, InterfaceC1230e interfaceC1230e2, InterfaceC1230e interfaceC1230e3, InterfaceC1230e interfaceC1230e4, int i) {
        if ((i & 1) != 0) {
            interfaceC1230e = c3924e.ad;
        }
        if ((i & 2) != 0) {
            interfaceC1230e2 = c3924e.vip;
        }
        if ((i & 4) != 0) {
            interfaceC1230e3 = c3924e.metrica;
        }
        if ((i & 8) != 0) {
            interfaceC1230e4 = c3924e.license;
        }
        c3924e.getClass();
        return new C3924e(interfaceC1230e, interfaceC1230e2, interfaceC1230e3, interfaceC1230e4);
    }

    @Override // defpackage.InterfaceC16154e
    public final AbstractC14073e ad(long j, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e) {
        float ad = this.ad.ad(j, interfaceC14388e);
        float ad2 = this.vip.ad(j, interfaceC14388e);
        float ad3 = this.metrica.ad(j, interfaceC14388e);
        float ad4 = this.license.ad(j, interfaceC14388e);
        float appmetrica = C2108e.appmetrica(j);
        float f = ad + ad4;
        if (f > appmetrica) {
            float f2 = appmetrica / f;
            ad *= f2;
            ad4 *= f2;
        }
        float f3 = ad2 + ad3;
        if (f3 > appmetrica) {
            float f4 = appmetrica / f3;
            ad2 *= f4;
            ad3 *= f4;
        }
        if (ad < 0.0f || ad2 < 0.0f || ad3 < 0.0f || ad4 < 0.0f) {
            AbstractC8889e.ad("Corner size in Px can't be negative(topStart = " + ad + ", topEnd = " + ad2 + ", bottomEnd = " + ad3 + ", bottomStart = " + ad4 + ")!");
        }
        if (ad + ad2 + ad3 + ad4 == 0.0f) {
            return new C14340e(AbstractC18489e.billing(0L, j));
        }
        C0763e billing = AbstractC18489e.billing(0L, j);
        EnumC7792e enumC7792e2 = EnumC7792e.f15794e;
        float f5 = enumC7792e == enumC7792e2 ? ad : ad2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (enumC7792e == enumC7792e2) {
            ad = ad2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(ad) << 32) | (Float.floatToRawIntBits(ad) & 4294967295L);
        float f6 = enumC7792e == enumC7792e2 ? ad3 : ad4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (enumC7792e != enumC7792e2) {
            ad4 = ad3;
        }
        return new C2904e(new C2330e(billing.ad, billing.vip, billing.metrica, billing.license, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(ad4) << 32) | (Float.floatToRawIntBits(ad4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3924e)) {
            return false;
        }
        C3924e c3924e = (C3924e) obj;
        return AbstractC7890e.billing(this.ad, c3924e.ad) && AbstractC7890e.billing(this.vip, c3924e.vip) && AbstractC7890e.billing(this.metrica, c3924e.metrica) && AbstractC7890e.billing(this.license, c3924e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.ad + ", topEnd = " + this.vip + ", bottomEnd = " + this.metrica + ", bottomStart = " + this.license + ')';
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [eْٟؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC5606e
    public final Object vip(Object obj, float f) {
        if (AbstractC7890e.billing(obj, AbstractC10432e.ad) || obj == null) {
            C3924e c3924e = AbstractC6549e.ad;
            ?? obj2 = new Object();
            obj = new C3924e(obj2, obj2, obj2, obj2);
        }
        if (!(obj instanceof C3924e)) {
            return null;
        }
        C3924e c3924e2 = (C3924e) obj;
        C3924e c3924e3 = AbstractC6549e.ad;
        return new C3924e(new C10446e(this.ad, c3924e2.ad, f), new C10446e(this.vip, c3924e2.vip, f), new C10446e(this.metrica, c3924e2.metrica, f), new C10446e(this.license, c3924e2.license, f));
    }
}
