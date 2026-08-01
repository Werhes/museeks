package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.conscrypt.Conscrypt;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17647e implements InterfaceC0774e, InterfaceC3665e, InterfaceC5808e, InterfaceC15275e, InterfaceC4088e, InterfaceC15580e, InterfaceC11962e, InterfaceC0771e, InterfaceC1323e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C11180e f34571e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ C17647e f34572e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34594e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C17647e f34578e = new C17647e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C3079e f34573e = new C3079e("AfterRender");

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C17647e f34587e = new C17647e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17647e f34570e = new C17647e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C17647e f34592e = new C17647e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C17647e f34591e = new C17647e(5);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C17647e f34582e = new C17647e(6);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C17647e f34589e = new C17647e(7);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C17647e f34574e = new C17647e(8);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C17647e f34583e = new C17647e(9);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C11180e f34576e = new C11180e(11);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C17647e f34580e = new C17647e(12);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C17647e f34581e = new C17647e(13);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C17647e f34579e = new C17647e(14);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C17647e f34577e = new C17647e(15);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final /* synthetic */ C17647e f34586e = new C17647e(16);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final /* synthetic */ C17647e f34593e = new C17647e(17);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C17647e f34575e = new C17647e(18);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C17647e f34585e = new C17647e(19);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C17647e f34588e = new C17647e(20);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C17647e f34590e = new C17647e(21);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C17647e f34584e = new C17647e(22);

    static {
        int i = 10;
        f34572e = new C17647e(i);
        f34571e = new C11180e(i);
    }

    public /* synthetic */ C17647e(int i) {
        this.f34594e = i;
    }

    public Signature[] ad(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.InterfaceC15580e
    public byte[] adcel(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int billing = AbstractC5907e.billing(bigInteger);
        byte[] bArr = new byte[billing * 2];
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        byte[] byteArray = bigInteger2.toByteArray();
        int max = Math.max(0, byteArray.length - billing);
        int length = byteArray.length - max;
        int i = billing - length;
        Arrays.fill(bArr, 0, i, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i, length);
        if (bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        byte[] byteArray2 = bigInteger3.toByteArray();
        int max2 = Math.max(0, byteArray2.length - billing);
        int length2 = byteArray2.length - max2;
        int i2 = (billing - length2) + billing;
        Arrays.fill(bArr, billing, i2, (byte) 0);
        System.arraycopy(byteArray2, max2, bArr, i2, length2);
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٍؘۡ, java.lang.Object] */
    @Override // defpackage.InterfaceC1323e
    public InterfaceC9815e admob(SSLSocket sSLSocket) {
        return new Object();
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        if (c0560e.advert()) {
            return (Bundle) c0560e.adcel();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(c0560e.startapp())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", c0560e.startapp());
    }

    @Override // defpackage.InterfaceC3665e
    public InterfaceC1108e amazon() {
        C4199e m4502e = C18353e.vip.m4502e();
        if (m4502e != null) {
            C14027e.ad.getClass();
            InterfaceC1108e signatures = AbstractC0054e.signatures(m4502e.m1506e(AbstractC3820e.ad.vip(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{Long.valueOf(C14027e.metrica())}, 1)));
            if (signatures != null) {
                return new C5786e(signatures, 15);
            }
        }
        return new C10250e(4, C10327e.f20377e);
    }

    @Override // defpackage.InterfaceC3665e
    public /* bridge */ /* synthetic */ C6571e appmetrica() {
        return null;
    }

    @Override // defpackage.InterfaceC3665e
    public String billing(Context context) {
        return context.getString(R.string.cache_library_title_virtual);
    }

    @Override // defpackage.InterfaceC15275e
    /* renamed from: extends */
    public AbstractC1186e mo1638extends(C13212e c13212e, String str, AbstractC10226e abstractC10226e, AbstractC10226e abstractC10226e2) {
        if (str.equals("kotlin.jvm.PlatformType")) {
            return c13212e.advert(AbstractC5745e.purchase) ? new C13902e(abstractC10226e, abstractC10226e2, 0) : AbstractC1596e.ad(abstractC10226e, abstractC10226e2);
        }
        return C18139e.vip(EnumC16799e.f32905e, str, abstractC10226e.toString(), abstractC10226e2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        C13886e c13886e = c9398e.f18713e;
        C3079e c3079e = C13886e.f27543e;
        C3079e c3079e2 = f34573e;
        c13886e.startapp(c3079e, c3079e2);
        c13886e.mopub(c3079e2, new C8265e((Function3) abstractC7185e, null, 0));
    }

    @Override // defpackage.InterfaceC1323e
    public boolean license(SSLSocket sSLSocket) {
        return C8711e.vip && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        switch (this.f34594e) {
            case 4:
                return AbstractC18275e.purchase((Executor) c18464e.inmobi(new C16786e(InterfaceC4086e.class, Executor.class)));
            default:
                return new C11047e(c18464e.m4510e(AbstractC16136e.class));
        }
    }

    @Override // defpackage.InterfaceC4088e
    public int startapp() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17647e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC15580e
    public BigInteger[] vip(BigInteger bigInteger, byte[] bArr) {
        int billing = AbstractC5907e.billing(bigInteger);
        if (bArr.length != billing * 2) {
            throw new IllegalArgumentException("Encoding has incorrect length");
        }
        BigInteger bigInteger2 = new BigInteger(1, AbstractC12442e.admob(0, billing, bArr));
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        BigInteger bigInteger3 = new BigInteger(1, AbstractC12442e.admob(billing, billing + billing, bArr));
        if (bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return new BigInteger[]{bigInteger2, bigInteger3};
    }

    @Override // defpackage.InterfaceC3665e
    public Object yandex(C15238e c15238e) {
        C5170e c5170e = C5170e.f11071e;
        C14027e.ad.getClass();
        Object startapp = c5170e.startapp(C14027e.metrica(), c15238e);
        return startapp == EnumC2821e.f6782e ? startapp : Unit.INSTANCE;
    }
}
