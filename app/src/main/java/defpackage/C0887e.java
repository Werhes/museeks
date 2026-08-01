package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0887e {
    public File ad;
    public String license;
    public InterfaceC1425e metrica;
    public InterfaceC14414e vip;

    public C0887e(File file, String str, C0521e c0521e, InterfaceC1425e interfaceC1425e) {
        AbstractC5542e.metrica(file);
        if (str == null || AbstractC8433e.license(str)) {
            throw new IllegalArgumentException();
        }
        AbstractC5542e.metrica(c0521e);
        this.ad = file;
        this.license = str;
        this.vip = c0521e;
        this.metrica = interfaceC1425e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eۣؔؐ] */
    public InterfaceC9354e ad() {
        ?? r0;
        String license = AbstractC16425e.license(this.ad.getName());
        C1879e c1879e = EnumC2948e.UNKNOWN;
        if (license != null && (r0 = (EnumC2948e) EnumC2948e.f6946e.get(license.toLowerCase(Locale.ROOT))) != 0) {
            c1879e = r0;
        }
        return c1879e.ad();
    }

    public InterfaceC1425e metrica(InterfaceC9354e interfaceC9354e) {
        InterfaceC1425e interfaceC1425e = (InterfaceC1425e) interfaceC9354e;
        this.metrica = interfaceC1425e;
        return interfaceC1425e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFileImpl{file=");
        sb.append(this.ad);
        sb.append(", audioHeader=");
        sb.append(this.vip);
        sb.append(", tag=");
        sb.append(this.metrica);
        sb.append(", extension='");
        return AbstractC1786e.signatures(sb, this.license, "'}");
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [eٌٜ۠, eُؒۚ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [eُؒۚ, eّٟٝ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eُؒۚ, eٌ٘ۚ] */
    /* JADX WARN: Type inference failed for: r1v9, types: [eٍْٗ, eُؒۚ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, e٘۠ۦ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eُٝۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eِٜٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, eٌؖ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eؘٖٛ, java.lang.Object] */
    public void vip() {
        AbstractC1305e abstractC1305e;
        InterfaceC1425e interfaceC1425e = this.metrica;
        if (interfaceC1425e != null && interfaceC1425e.vip()) {
            throw new Exception("Opened read only");
        }
        C18478e m4523default = C18478e.m4523default();
        m4523default.getClass();
        String str = this.license;
        C7540e c7540e = (C7540e) ((AbstractC8507e) m4523default.f36229e).get(str);
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        if (c7540e == null) {
            throw new C9163e("No Deleter associated with this extension:%s", str);
        }
        switch (c7540e.ad) {
            case 0:
                ?? abstractC1305e2 = new AbstractC1305e();
                ?? obj = new Object();
                obj.ad = new C18334e(z2 ? 1 : 0);
                abstractC1305e2.metrica = obj;
                abstractC1305e = abstractC1305e2;
                break;
            case 1:
                ?? abstractC1305e3 = new AbstractC1305e();
                abstractC1305e3.license = new Object();
                abstractC1305e = abstractC1305e3;
                break;
            case 2:
                abstractC1305e = new AbstractC1305e();
                break;
            case 3:
                abstractC1305e = new AbstractC1305e();
                break;
            case 4:
                abstractC1305e = new AbstractC1305e();
                break;
            case 5:
                abstractC1305e = new AbstractC1305e();
                break;
            case 6:
                ?? abstractC1305e4 = new AbstractC1305e();
                ?? obj2 = new Object();
                obj2.ad = new Object();
                abstractC1305e4.license = obj2;
                abstractC1305e = abstractC1305e4;
                break;
            default:
                ?? abstractC1305e5 = new AbstractC1305e();
                ?? obj3 = new Object();
                C15816e c15816e = new C15816e(20, z);
                c15816e.f31190e = new C18334e(i);
                obj3.ad = c15816e;
                obj3.vip = new C10433e();
                abstractC1305e5.metrica = obj3;
                abstractC1305e = abstractC1305e5;
                break;
        }
        InterfaceC17273e interfaceC17273e = (C3867e) m4523default.f36228e;
        if (interfaceC17273e == null) {
            interfaceC17273e = C13784e.ad;
        }
        abstractC1305e.ad = interfaceC17273e;
        abstractC1305e.license(this);
    }
}
