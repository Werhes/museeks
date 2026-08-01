package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4524e implements InterfaceC15524e, InterfaceC1598e, InterfaceC2726e, InterfaceC13521e, InterfaceC4978e, InterfaceC11962e, InterfaceC7004e, InterfaceC0771e, InterfaceC10544e, InterfaceC10260e, InterfaceC18204e, InterfaceC17063e, InterfaceC2872e, InterfaceC7854e, InterfaceC4543e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9818e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C4524e f9806e = new C4524e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C4524e f9801e = new C4524e(3);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C0763e f9813e = new C0763e(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C4524e f9798e = new C4524e(5);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C4524e f9816e = new C4524e(6);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C4524e f9815e = new C4524e(7);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C4524e f9810e = new C4524e(9);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C4524e f9814e = new C4524e(10);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C4524e f9802e = new C4524e(11);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C4524e f9811e = new C4524e(12);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C4524e f9800e = new C4524e(13);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C4524e f9799e = new C4524e(14);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C4524e f9804e = new C4524e(15);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C4524e f9808e = new C4524e(16);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C4524e f9809e = new C4524e(17);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C4524e f9807e = new C4524e(18);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C4524e f9805e = new C4524e(19);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C4524e f9812e = new C4524e(20);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C4524e f9817e = new C4524e(21);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C4524e f9803e = new C4524e(22);

    public /* synthetic */ C4524e(int i) {
        this.f9818e = i;
    }

    public static C0095e applovin(int i) {
        float f = (i & 1) != 0 ? 1.0f : 1.05f;
        return new C0095e(f, 1.1f, f, f, f);
    }

    public static int isPro(EnumC1034e enumC1034e) {
        int i = enumC1034e == null ? -1 : AbstractC6443e.ad[enumC1034e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 2;
            }
        }
        return 1;
    }

    public static C18136e signatures(long j, long j2, C13770e c13770e, int i, int i2) {
        long startapp = (i2 & 1) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).startapp() : j;
        long ad = AbstractC12491e.ad(startapp, c13770e);
        long license = (i2 & 4) != 0 ? ((C6032e) c13770e.adcel(AbstractC12491e.ad)).license() : j2;
        long ad2 = AbstractC12491e.ad(license, c13770e);
        long ad3 = AbstractC12491e.ad(license, c13770e);
        C15492e c15492e = AbstractC12491e.ad;
        return new C18136e(startapp, ad, license, ad2, license, ad3, C3618e.vip(0.4f, ((C6032e) c13770e.adcel(c15492e)).adcel()), ((C6032e) c13770e.adcel(c15492e)).appmetrica());
    }

    @Override // defpackage.InterfaceC13521e
    public void Signature(InterfaceC5052e interfaceC5052e, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC5052e.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.InterfaceC18204e
    public byte[] ad(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v7, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.InterfaceC15524e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adcel(defpackage.C5033e r6, java.lang.ClassLoader r7, java.util.ArrayList r8, defpackage.InterfaceC5083e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C3252e
            if (r0 == 0) goto L13
            r0 = r9
            eٍٍؕ r0 = (defpackage.C3252e) r0
            int r1 = r0.f7390e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7390e = r1
            goto L1a
        L13:
            eٍٍؕ r0 = new eٍٍؕ
            eُؑ۠ r9 = (defpackage.AbstractC10731e) r9
            r0.<init>(r5, r9)
        L1a:
            java.lang.Object r9 = r0.f7391e
            int r1 = r0.f7390e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.util.Iterator r6 = r0.f7392e
            java.lang.ClassLoader r7 = r0.f7387e
            eًؗٝ r8 = r0.f7389e
            defpackage.AbstractC2003e.purchase(r9)
            r4 = r8
            r8 = r7
            r7 = r4
            goto L4a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.AbstractC2003e.purchase(r9)
            eؘؓٞ r9 = r6.f10722e
            eؒۙ۠ r1 = defpackage.AbstractC4340e.vip
            r9.premium(r1, r6)
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L4a:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L69
            java.lang.Object r9 = r6.next()
            eً٘ٚ r9 = (defpackage.C7995e) r9
            eؚٖؓ r9 = r9.ad
            r0.f7389e = r7
            r0.f7387e = r8
            r0.f7392e = r6
            r0.f7390e = r2
            java.lang.Object r9 = r9.invoke(r7, r8, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r9 != r1) goto L4a
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4524e.adcel(eًؗٝ, java.lang.ClassLoader, java.util.ArrayList, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4543e
    public int admob(C13391e c13391e, C7507e c7507e, int i) {
        c7507e.f19062e = 4;
        return -4;
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        Intent intent = (Intent) ((Bundle) c0560e.adcel()).getParcelable("notification_data");
        if (intent != null) {
            return new C18320e(intent);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4543e
    public int amazon(long j) {
        return 0;
    }

    @Override // defpackage.InterfaceC10260e
    public float appmetrica() {
        return 0;
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] billing(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        try {
            C14868e.metrica();
            Provider provider = C14868e.metrica().getProvider();
            if (!AbstractC1786e.startapp(1)) {
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            if (bArr.length != 32) {
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
            if (bArr3 == null) {
                throw new NullPointerException("ciphertext is null");
            }
            if (bArr2.length != 12) {
                throw new GeneralSecurityException("nonce length must be 12 bytes.");
            }
            if (bArr3.length < i + 16) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            return cipher.doFinal(bArr3, i, bArr3.length - i);
        } catch (GeneralSecurityException unused) {
            return new C9954e(0, bArr).m3038instanceof(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
    }

    @Override // defpackage.InterfaceC7854e
    public int inmobi(C16975e c16975e) {
        String str = c16975e.loadAd;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("Unsupported MIME type: ", str));
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] isVip() {
        return AbstractC0097e.mopub;
    }

    @Override // defpackage.InterfaceC4543e
    public boolean license() {
        return true;
    }

    @Override // defpackage.InterfaceC13521e
    public void loadAd(InterfaceC0390e interfaceC0390e) {
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC0390e);
    }

    @Override // defpackage.InterfaceC10544e
    public C17996e metrica(Class cls) {
        if (!AbstractC11202e.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C17996e) AbstractC11202e.purchase(cls.asSubclass(AbstractC11202e.class)).startapp(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.InterfaceC7854e
    public boolean mopub(C16975e c16975e) {
        String str = c16975e.loadAd;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public void pro(C6260e c6260e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-800314720);
        int i2 = (c13770e.purchase(c6260e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C15492e c15492e = AbstractC10577e.ad;
            Function1 function1 = (Function1) c13770e.adcel(c15492e);
            boolean purchase = c13770e.purchase(function1) | ((i2 & 14) == 4);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C13942e(c6260e, function1, 4);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC1101e.ad(c15492e.ad((Function1) m3681throw), c2892e, c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 11, this, c6260e, c2892e);
        }
    }

    @Override // defpackage.InterfaceC4978e
    public int purchase(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    @Override // defpackage.InterfaceC7854e
    public InterfaceC10625e remoteconfig(C16975e c16975e) {
        String str = c16975e.loadAd;
        List list = c16975e.subscription;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C5306e(list);
                case 1:
                    return new C11106e(15);
                case 2:
                    return new C2362e(20);
                case 3:
                    return new C5891e(26);
                case 4:
                    return new C4853e(list);
                case 5:
                    return new C6760e(list);
                case 6:
                    return new C4479e(list);
                case 7:
                    return new C9454e();
                case '\b':
                    return new C9965e();
            }
        }
        throw new IllegalArgumentException(AbstractC17861e.Signature("Unsupported MIME type: ", str));
    }

    @Override // defpackage.InterfaceC4543e
    public void smaato() {
    }

    @Override // defpackage.InterfaceC17063e
    public byte[] startapp(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        try {
            C14868e.metrica();
            Provider provider = C14868e.metrica().getProvider();
            if (!AbstractC1786e.startapp(1)) {
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            if (bArr.length != 32) {
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
            if (bArr3 == null) {
                throw new NullPointerException("plaintext is null");
            }
            if (bArr2.length != 12) {
                throw new GeneralSecurityException("nonce length must be 12 bytes.");
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            int outputSize = cipher.getOutputSize(bArr3.length);
            if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] bArr5 = new byte[i + outputSize];
            if (cipher.doFinal(bArr3, 0, bArr3.length, bArr5, i) == outputSize) {
                return bArr5;
            }
            throw new GeneralSecurityException("not enough data written");
        } catch (GeneralSecurityException unused) {
            C9954e c9954e = new C9954e(0, bArr);
            if (bArr3.length > 2147483631) {
                throw new GeneralSecurityException("plaintext too long");
            }
            ByteBuffer allocate = ByteBuffer.allocate(bArr3.length + 16);
            c9954e.m3040switch(allocate, bArr2, bArr3, bArr4);
            byte[] array = allocate.array();
            if (array.length > Alert.DURATION_SHOW_INDEFINITELY - i) {
                throw new InvalidAlgorithmParameterException("Plaintext too long");
            }
            byte[] bArr6 = new byte[array.length + i];
            System.arraycopy(array, 0, bArr6, i, array.length);
            return bArr6;
        }
    }

    @Override // defpackage.InterfaceC17063e
    public int subscription() {
        return 32;
    }

    @Override // defpackage.InterfaceC10260e
    public void tapsense(InterfaceC14388e interfaceC14388e, int i, int[] iArr, EnumC7792e enumC7792e, int[] iArr2) {
        if (enumC7792e == EnumC7792e.f15794e) {
            AbstractC16497e.metrica(i, iArr, iArr2, false);
        } else {
            AbstractC16497e.vip(iArr, iArr2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
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
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4524e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f9818e) {
            case 10:
                return "Center";
            case 15:
                return "[]";
            case 23:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC10544e
    /* renamed from: vip */
    public boolean mo2947vip(Class cls) {
        return AbstractC11202e.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC2872e
    public long yandex(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i = AbstractC14770e.ad;
            return floatToRawIntBits;
        }
        float metrica = AbstractC5967e.metrica(j, j2);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(metrica) << 32) | (Float.floatToRawIntBits(metrica) & 4294967295L);
        int i2 = AbstractC14770e.ad;
        return floatToRawIntBits2;
    }
}
