package defpackage;

import android.os.Build;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;

/* renamed from: eؚٛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7290e {
    public final /* synthetic */ int ad;
    public static final C2892e vip = new C2892e(-94136866, false, new C13428e(4));
    public static final C2892e metrica = new C2892e(-1578602681, false, new C13428e(5));

    public /* synthetic */ C7290e(int i) {
        this.ad = i;
    }

    public static final InterfaceC1108e ad(InterfaceC14287e interfaceC14287e) {
        C13655e premium = ((InterfaceC10518e) interfaceC14287e).premium();
        if (premium == null) {
            throw new IllegalStateException("Changes cannot be observed on unmanaged objects.");
        }
        InterfaceC15348e interfaceC15348e = premium.f27072e;
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC15348e.remoteconfig()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        if (realmcJNI.realm_is_closed(ptr$cinterop_release)) {
            throw new IllegalStateException("Changes cannot be observed when the Realm has been closed.");
        }
        if (premium.isValid()) {
            return interfaceC15348e.inmobi().mo1504e(premium, null);
        }
        throw new IllegalStateException("Changes cannot be observed on objects that have been deleted from the Realm.");
    }

    public static int adcel() {
        return Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public static final C11058e mopub(C11058e c11058e) {
        C7677e ad = c11058e.ad();
        AbstractC12834e abstractC12834e = c11058e.f21945e;
        ad.billing = new C9217e(abstractC12834e.purchase(), abstractC12834e.license());
        return ad.ad();
    }

    public static final boolean startapp(InterfaceC14287e interfaceC14287e) {
        C13655e premium = ((InterfaceC10518e) interfaceC14287e).premium();
        if (premium == null) {
            return true;
        }
        LongPointerWrapper longPointerWrapper = premium.f27071e;
        if (longPointerWrapper.isReleased()) {
            return false;
        }
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_object_is_valid(ptr$cinterop_release);
    }

    public static final boolean yandex(InterfaceC14287e interfaceC14287e) {
        return ((InterfaceC10518e) interfaceC14287e).premium() != null;
    }

    public short appmetrica(short s) {
        return license(AbstractC15792e.vip(s));
    }

    public short billing(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 6) * (64 & j);
        long j4 = j ^ (j << 7);
        long j5 = ((j2 << 5) * (j4 & 524320)) ^ (((((j3 ^ ((16385 & j4) * j2)) ^ ((j2 << 1) * (32770 & j4))) ^ ((j2 << 2) * (65540 & j4))) ^ ((j2 << 3) * (131080 & j4))) ^ ((j2 << 4) * (262160 & j4)));
        long j6 = 137371844608L & j5;
        return license(((int) (j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24))))) & 67108863);
    }

    public final short license(int i) {
        int i2;
        switch (this.ad) {
            case 0:
                int i3 = (2093056 & i) >>> 9;
                int i4 = (14680064 & i) >>> 18;
                i2 = (i >>> 21) ^ ((((i & 4095) ^ (i >>> 12)) ^ i3) ^ i4);
                break;
            default:
                int i5 = i & 8191;
                int i6 = i >>> 13;
                int i7 = ((i6 << 4) ^ (i6 << 3)) ^ (i6 << 1);
                int i8 = i7 >>> 13;
                i2 = (((i6 ^ i5) ^ i8) ^ (i7 & 8191)) ^ (((i8 << 4) ^ (i8 << 3)) ^ (i8 << 1));
                break;
        }
        return (short) i2;
    }

    public final short metrica(short s, short s2) {
        switch (this.ad) {
            case 0:
                int i = (s2 & 1) * s;
                for (int i2 = 1; i2 < 12; i2++) {
                    i ^= ((1 << i2) & s2) * s;
                }
                return license(i);
            default:
                int i3 = (s2 & 1) * s;
                for (int i4 = 1; i4 < 13; i4++) {
                    i3 ^= ((1 << i4) & s2) * s;
                }
                return license(i3);
        }
    }

    public short purchase(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 18) * (64 & j);
        long j4 = j ^ (j << 21);
        long j5 = ((j2 << 15) * (j4 & 8589934624L)) ^ (((((j3 ^ ((268435457 & j4) * j2)) ^ ((j2 << 3) * (536870914 & j4))) ^ ((j2 << 6) * (1073741828 & j4))) ^ ((j2 << 9) * (2147483656L & j4))) ^ ((j2 << 12) * (4294967312L & j4)));
        long j6 = 2305834213120671744L & j5;
        long j7 = j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24)));
        long j8 = 8796025913344L & j7;
        return license(((int) (j7 ^ ((j8 >>> 26) ^ (((j8 >>> 18) ^ (j8 >>> 20)) ^ (j8 >>> 24))))) & 67108863);
    }

    public final short vip(short s) {
        switch (this.ad) {
            case 0:
                short metrica2 = metrica(appmetrica(s), s);
                short metrica3 = metrica(appmetrica(appmetrica(metrica2)), metrica2);
                return appmetrica(metrica(appmetrica(metrica(appmetrica(appmetrica(metrica(appmetrica(appmetrica(appmetrica(appmetrica(metrica3)))), metrica3))), metrica2)), s));
            default:
                short billing = billing(s, s);
                short purchase = purchase(billing, billing);
                return billing(purchase(license(AbstractC15792e.vip(license(AbstractC15792e.vip(purchase(license(AbstractC15792e.vip(license(AbstractC15792e.vip(purchase)))), purchase))))), purchase), (short) 1);
        }
    }
}
