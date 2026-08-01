package defpackage;

import android.graphics.PointF;
import android.util.Log;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5438e implements InterfaceC5808e, InterfaceC5592e, InterfaceC2684e, InterfaceC0774e, InterfaceC0736e, InterfaceC11962e, InterfaceC10260e, InterfaceC12321e, InterfaceC1598e, InterfaceC2872e, InterfaceC17722e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C5438e f11673e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C8391e f11677e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11702e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C10156e f11676e = new C10156e(-1.0f, -1.0f);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C10156e f11669e = new C10156e(0.0f, -1.0f);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C10156e f11693e = new C10156e(1.0f, -1.0f);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C10156e f11666e = new C10156e(-1.0f, 0.0f);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10156e f11700e = new C10156e(0.0f, 0.0f);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C10156e f11699e = new C10156e(1.0f, 0.0f);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C10156e f11682e = new C10156e(-1.0f, 1.0f);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C10156e f11695e = new C10156e(0.0f, 1.0f);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C10156e f11670e = new C10156e(1.0f, 1.0f);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C14544e f11685e = new C14544e(-1.0f);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C14544e f11668e = new C14544e(0.0f);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C14544e f11667e = new C14544e(1.0f);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C9577e f11672e = new C9577e(-1.0f);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C9577e f11678e = new C9577e(0.0f);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C9577e f11680e = new C9577e(1.0f);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C5438e f11691e = new C5438e(4);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C5438e f11701e = new C5438e(5);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C5438e f11671e = new C5438e(6);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C5438e f11687e = new C5438e(7);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C5438e f11694e = new C5438e(8);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C5438e f11696e = new C5438e(9);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C5438e f11686e = new C5438e(10);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C5438e f11683e = new C5438e(11);

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final C5438e f11684e = new C5438e(12);

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final C5438e f11690e = new C5438e(13);

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final C5438e f11681e = new C5438e(14);

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final C5438e f11675e = new C5438e(15);

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final C5438e f11688e = new C5438e(16);

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final C5438e f11674e = new C5438e(17);

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final C5438e f11692e = new C5438e(18);

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final C5438e f11689e = new C5438e(19);

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final C5438e f11679e = new C5438e(20);

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static final C5438e f11697e = new C5438e(21);

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final C5438e f11698e = new C5438e(22);

    static {
        int i = 3;
        f11677e = new C8391e(i);
        f11673e = new C5438e(i);
    }

    public /* synthetic */ C5438e(int i) {
        this.f11702e = i;
    }

    public static InterfaceC3054e pro(InterfaceC6647e interfaceC6647e) {
        while (interfaceC6647e instanceof InterfaceC0390e) {
            InterfaceC0390e interfaceC0390e = (InterfaceC0390e) interfaceC6647e;
            if (interfaceC0390e.mo334e() != 2) {
                break;
            }
            interfaceC6647e = (InterfaceC0390e) AbstractC13480e.m3599static(interfaceC0390e.mo337finally());
            if (interfaceC6647e == null) {
                return null;
            }
        }
        return interfaceC6647e.adcel();
    }

    @Override // defpackage.InterfaceC17722e
    public SecretKeyFactory Signature(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // defpackage.InterfaceC2684e
    public boolean ad(InterfaceC5052e interfaceC5052e, C0530e c0530e) {
        return !c0530e.getAnnotations().amazon(AbstractC0493e.ad);
    }

    @Override // defpackage.InterfaceC17722e
    public SecureRandom adcel() {
        return SecureRandom.getInstance("DEFAULT");
    }

    public boolean admob(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    @Override // defpackage.InterfaceC17722e
    public AlgorithmParameters advert(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    public boolean amazon(InterfaceC15498e interfaceC15498e, InterfaceC15498e interfaceC15498e2, boolean z) {
        if ((interfaceC15498e instanceof InterfaceC5052e) && (interfaceC15498e2 instanceof InterfaceC5052e)) {
            return AbstractC7890e.billing(((InterfaceC5052e) interfaceC15498e).mo1459goto(), ((InterfaceC5052e) interfaceC15498e2).mo1459goto());
        }
        if ((interfaceC15498e instanceof InterfaceC16046e) && (interfaceC15498e2 instanceof InterfaceC16046e)) {
            return loadAd((InterfaceC16046e) interfaceC15498e, (InterfaceC16046e) interfaceC15498e2, z, C5983e.f12619e);
        }
        if (!(interfaceC15498e instanceof InterfaceC6647e) || !(interfaceC15498e2 instanceof InterfaceC6647e)) {
            return ((interfaceC15498e instanceof InterfaceC9646e) && (interfaceC15498e2 instanceof InterfaceC9646e)) ? AbstractC7890e.billing(((AbstractC14941e) ((InterfaceC9646e) interfaceC15498e)).f29618e, ((AbstractC14941e) ((InterfaceC9646e) interfaceC15498e2)).f29618e) : AbstractC7890e.billing(interfaceC15498e, interfaceC15498e2);
        }
        InterfaceC6647e interfaceC6647e = (InterfaceC6647e) interfaceC15498e;
        InterfaceC6647e interfaceC6647e2 = (InterfaceC6647e) interfaceC15498e2;
        if (!interfaceC6647e.equals(interfaceC6647e2)) {
            if (AbstractC7890e.billing(interfaceC6647e.getName(), interfaceC6647e2.getName()) && ((!(interfaceC6647e instanceof InterfaceC17577e) || !(interfaceC6647e2 instanceof InterfaceC17577e) || ((InterfaceC17577e) interfaceC6647e).mo1942e() == ((InterfaceC17577e) interfaceC6647e2).mo1942e()) && ((!AbstractC7890e.billing(interfaceC6647e.mo1351switch(), interfaceC6647e2.mo1351switch()) || (z && AbstractC7890e.billing(pro(interfaceC6647e), pro(interfaceC6647e2)))) && !AbstractC14300e.smaato(interfaceC6647e) && !AbstractC14300e.smaato(interfaceC6647e2)))) {
                InterfaceC15498e mo1351switch = interfaceC6647e.mo1351switch();
                InterfaceC15498e mo1351switch2 = interfaceC6647e2.mo1351switch();
                if (((mo1351switch instanceof InterfaceC0390e) || (mo1351switch2 instanceof InterfaceC0390e)) ? false : amazon(mo1351switch, mo1351switch2, z)) {
                    C14514e c14514e = new C14514e(new C12309e(z, interfaceC6647e, interfaceC6647e2, 6));
                    if (c14514e.smaato(interfaceC6647e, interfaceC6647e2, null, true).vip() != 1 || c14514e.smaato(interfaceC6647e2, interfaceC6647e, null, true).vip() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC10260e
    public float appmetrica() {
        return 0;
    }

    @Override // defpackage.InterfaceC17722e
    public Cipher billing(String str) {
        return Cipher.getInstance(str);
    }

    @Override // defpackage.InterfaceC17722e
    public Signature createSignature(String str) {
        return Signature.getInstance(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        c9398e.f18713e.mopub(C13886e.f27543e, new C7054e((Function3) abstractC7185e, null, 1));
    }

    public void isVip(String str, Exception exc) {
        if (admob(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.InterfaceC5592e
    public PointF license(C15099e c15099e, int i) {
        return new PointF(c15099e.ad, c15099e.vip);
    }

    public boolean loadAd(InterfaceC16046e interfaceC16046e, InterfaceC16046e interfaceC16046e2, boolean z, Function2 function2) {
        if (interfaceC16046e.equals(interfaceC16046e2)) {
            return true;
        }
        if (AbstractC7890e.billing(interfaceC16046e.mo1351switch(), interfaceC16046e2.mo1351switch())) {
            return false;
        }
        InterfaceC15498e mo1351switch = interfaceC16046e.mo1351switch();
        InterfaceC15498e mo1351switch2 = interfaceC16046e2.mo1351switch();
        return (((mo1351switch instanceof InterfaceC0390e) || (mo1351switch2 instanceof InterfaceC0390e)) ? ((Boolean) function2.invoke(mo1351switch, mo1351switch2)).booleanValue() : amazon(mo1351switch, mo1351switch2, z)) && interfaceC16046e.getIndex() == interfaceC16046e2.getIndex();
    }

    @Override // defpackage.InterfaceC17722e
    public MessageDigest metrica(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // defpackage.InterfaceC17722e
    public CertificateFactory mopub(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // defpackage.InterfaceC12321e
    public long purchase(long j) {
        return j;
    }

    @Override // defpackage.InterfaceC17722e
    public KeyFactory remoteconfig(String str) {
        return KeyFactory.getInstance(str);
    }

    public void signatures(String str) {
        if (admob(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return AbstractC18275e.purchase((Executor) c18464e.inmobi(new C16786e(InterfaceC13161e.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC17722e
    public Mac startapp(String str) {
        return Mac.getInstance(str);
    }

    public void subscription(String str) {
        if (admob(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.InterfaceC10260e
    public void tapsense(InterfaceC14388e interfaceC14388e, int i, int[] iArr, EnumC7792e enumC7792e, int[] iArr2) {
        AbstractC16497e.vip(iArr, iArr2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5438e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f11702e) {
            case 11:
                int i = AbstractC1961e.f5150e;
                return "TimeSource(System.nanoTime())";
            case 23:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0736e
    public C16194e vip() {
        return new C16194e(AbstractC1961e.ad());
    }

    @Override // defpackage.InterfaceC2872e
    public long yandex(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i = AbstractC14770e.ad;
        return floatToRawIntBits;
    }
}
