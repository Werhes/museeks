package defpackage;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14911e implements InterfaceC1436e, InterfaceC7004e, InterfaceC15316e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C14911e f29546e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C14911e f29547e = new C14911e("sans-serif", 0);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C14911e f29548e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C14911e f29549e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f29550e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29551e;

    static {
        int i = 1;
        f29548e = new C14911e("TINK", i);
        f29546e = new C14911e("CRUNCHY", i);
        f29549e = new C14911e("NO_PREFIX", i);
    }

    public C14911e() {
        this.f29551e = 2;
        this.f29550e = BuildConfig.FLAVOR;
    }

    public /* synthetic */ C14911e(String str, int i) {
        this.f29551e = i;
        this.f29550e = str;
    }

    public C14911e(String str, InterfaceC3894e interfaceC3894e) {
        this.f29551e = 3;
        this.f29550e = str;
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
    }

    @Override // defpackage.InterfaceC15316e
    public void ad(C7971e c7971e) {
        C11125e c11125e = (C11125e) c7971e.loadAd();
        Parcel m4156e = c11125e.m4156e();
        int i = AbstractC0923e.ad;
        m4156e.writeInt(1);
        int applovin = AbstractC16852e.applovin(m4156e, 20293);
        AbstractC16852e.remoteconfig(m4156e, 1, this.f29550e);
        AbstractC16852e.isPro(m4156e, 2, 4);
        m4156e.writeInt(0);
        AbstractC16852e.ads(m4156e, applovin);
        c11125e.m4153e(m4156e, 2009);
    }

    @Override // defpackage.InterfaceC1436e
    public String getServiceName() {
        switch (this.f29551e) {
            case 3:
                return this.f29550e;
            default:
                return this.f29550e;
        }
    }

    public void license(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        if (4 >= AbstractC8703e.m2467class(C8880e.license)) {
            C18409e c18409e = C18409e.metrica;
            String adcel = AbstractC10257e.adcel(this.f29550e, str);
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            Iterator it = C8880e.vip.iterator();
            while (it.hasNext()) {
                ((C0715e) it.next()).ad(c18409e, 5, adcel, Arrays.copyOf(copyOf2, copyOf2.length));
            }
        }
    }

    public void metrica(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        if (1 >= AbstractC8703e.m2467class(C8880e.license)) {
            C18409e c18409e = C18409e.metrica;
            String adcel = AbstractC10257e.adcel(this.f29550e, str);
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            Iterator it = C8880e.vip.iterator();
            while (it.hasNext()) {
                ((C0715e) it.next()).ad(c18409e, 2, adcel, Arrays.copyOf(copyOf2, copyOf2.length));
            }
        }
    }

    public String toString() {
        switch (this.f29551e) {
            case 0:
                return this.f29550e;
            case 1:
                return this.f29550e;
            case 5:
                return AbstractC17540e.license("\n            Args." + this.f29550e + "\n        ");
            default:
                return super.toString();
        }
    }

    public void vip(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        if (3 >= AbstractC8703e.m2467class(C8880e.license)) {
            C18409e c18409e = C18409e.metrica;
            String adcel = AbstractC10257e.adcel(this.f29550e, str);
            Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
            Iterator it = C8880e.vip.iterator();
            while (it.hasNext()) {
                ((C0715e) it.next()).ad(c18409e, 4, adcel, Arrays.copyOf(copyOf2, copyOf2.length));
            }
        }
    }
}
