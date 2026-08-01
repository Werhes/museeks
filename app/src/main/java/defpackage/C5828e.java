package defpackage;

import android.util.SparseArray;
import androidx.car.app.hardware.common.CarZone;
import org.conscrypt.PSKKeyManager;

/* renamed from: eؘۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5828e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Cloneable f12280e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Cloneable f12281e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f12282e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f12283e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Cloneable f12284e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f12285e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f12286e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Cloneable f12287e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Cloneable f12288e;

    public C5828e(int i, int i2) {
        this.f12286e = i;
        this.f12282e = i2;
        this.f12281e = new SparseArray();
        this.f12284e = new SparseArray();
        this.f12280e = new SparseArray();
        this.f12288e = new SparseArray();
        this.f12287e = new SparseArray();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[], java.lang.Cloneable] */
    public C5828e(InterfaceC2227e interfaceC2227e) {
        int isPro = interfaceC2227e.isPro() * 8;
        if (isPro % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (isPro > interfaceC2227e.isPro() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (interfaceC2227e.isPro() * 8));
        }
        this.f12285e = new C8011e(interfaceC2227e);
        this.f12282e = isPro / 8;
        int isPro2 = interfaceC2227e.isPro() * 8;
        int i = 135;
        switch (isPro2) {
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 320:
                i = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i = 45;
                break;
            case 224:
                i = 777;
                break;
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                i = 1061;
                break;
            case 384:
                i = 4109;
                break;
            case 448:
                i = 2129;
                break;
            case AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                i = 293;
                break;
            case 768:
                i = 655377;
                break;
            case 1024:
                i = 524355;
                break;
            case 2048:
                i = 548865;
                break;
            default:
                throw new IllegalArgumentException(AbstractC1786e.admob(isPro2, "Unknown block size for CMAC: "));
        }
        ?? r0 = new byte[4];
        AbstractC3628e.billing(i, 0, r0);
        this.f12281e = r0;
        this.f12280e = new byte[interfaceC2227e.isPro()];
        this.f12288e = new byte[interfaceC2227e.isPro()];
        this.f12284e = new byte[interfaceC2227e.isPro()];
        this.f12286e = 0;
    }

    public byte[] ad(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i2 = (-i) & 255;
                int length2 = bArr.length - 3;
                byte b = bArr2[length2];
                byte[] bArr3 = (byte[]) this.f12281e;
                bArr2[length2] = (byte) (b ^ (bArr3[1] & i2));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) ((bArr3[2] & i2) ^ bArr2[length3]);
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((i2 & bArr3[3]) ^ bArr2[length4]);
                return bArr2;
            }
            int i3 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i3 << 1));
            i = (i3 >>> 7) & 1;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        Object obj;
        byte[] bArr2 = (byte[]) this.f12280e;
        byte[] bArr3 = (byte[]) this.f12288e;
        C8011e c8011e = (C8011e) this.f12285e;
        int isPro = c8011e.f16252e.isPro();
        int i2 = this.f12286e;
        if (i2 == isPro) {
            obj = this.f12287e;
        } else {
            int length = bArr3.length;
            bArr3[i2] = Byte.MIN_VALUE;
            while (true) {
                i2++;
                if (i2 >= bArr3.length) {
                    break;
                }
                bArr3[i2] = 0;
            }
            obj = this.f12283e;
        }
        byte[] bArr4 = (byte[]) obj;
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i3]);
        }
        c8011e.tapsense(0, 0, bArr3, bArr2);
        int i4 = this.f12282e;
        System.arraycopy(bArr2, 0, bArr, 0, i4);
        reset();
        return i4;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return ((C8011e) this.f12285e).getAlgorithmName();
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f12282e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.lang.Cloneable] */
    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C8011e c8011e = (C8011e) this.f12285e;
        if (interfaceC3894e != null && !(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
        c8011e.init(true, interfaceC3894e);
        byte[] bArr = (byte[]) this.f12284e;
        byte[] bArr2 = new byte[bArr.length];
        c8011e.tapsense(0, 0, bArr, bArr2);
        ?? ad = ad(bArr2);
        this.f12287e = ad;
        this.f12283e = ad(ad);
        reset();
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f12288e;
            if (i >= bArr.length) {
                this.f12286e = 0;
                ((C8011e) this.f12285e).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        int i = this.f12286e;
        byte[] bArr = (byte[]) this.f12288e;
        if (i == bArr.length) {
            ((C8011e) this.f12285e).tapsense(0, 0, bArr, (byte[]) this.f12280e);
            this.f12286e = 0;
        }
        int i2 = this.f12286e;
        this.f12286e = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f12280e;
        byte[] bArr3 = (byte[]) this.f12288e;
        C8011e c8011e = (C8011e) this.f12285e;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int isPro = c8011e.f16252e.isPro();
        int i3 = this.f12286e;
        int i4 = isPro - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c8011e.tapsense(0, 0, bArr3, bArr2);
            this.f12286e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > isPro) {
                c8011e.tapsense(i, 0, bArr, bArr2);
                i2 -= isPro;
                i += isPro;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f12286e, i2);
        this.f12286e += i2;
    }
}
