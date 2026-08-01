package defpackage;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* renamed from: eٖۖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16426e implements InterfaceC6045e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f32249e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C12222e f32250e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C1061e f32251e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public SecureRandom f32252e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f32253e;

    /* JADX WARN: Type inference failed for: r1v4, types: [eَؑٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC6045e
    public final byte[] adcel() {
        AbstractC7629e vip = ((C4577e) this.f32250e.f3209e).vip.vip();
        vip.billing((byte[]) this.f32250e.f24541e.f23815e);
        byte[] bArr = new byte[this.f32249e.getDigestSize()];
        int i = 0;
        this.f32249e.doFinal(bArr, 0);
        int i2 = vip.ad;
        byte[] bArr2 = new byte[i2];
        SecureRandom secureRandom = this.f32252e;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy((byte[]) this.f32250e.f24541e.f23815e, 0, bArr2, 0, i2);
        }
        C12222e c12222e = this.f32250e;
        byte[] bArr3 = this.f32253e;
        C4577e c4577e = (C4577e) c12222e.f3209e;
        C7358e c7358e = c12222e.f24540e;
        C11883e c11883e = c12222e.f24541e;
        AbstractC7629e vip2 = c4577e.vip.vip();
        byte[] bArr4 = (byte[]) c11883e.f23815e;
        vip2.billing(bArr4);
        C13935e c13935e = new C13935e(vip2);
        byte[] appmetrica = vip2.appmetrica(c7358e.vip, bArr2, bArr3, bArr);
        C15475e metrica = vip2.metrica(appmetrica, (byte[]) c11883e.f23815e, (byte[]) c11883e.f23814e, bArr3, bArr);
        byte[] bArr5 = (byte[]) metrica.metrica;
        long j = metrica.vip;
        int i3 = metrica.ad;
        C13935e c13935e2 = new C13935e(1);
        c13935e2.m3736import(3);
        c13935e2.m3741private(j);
        c13935e2.m3745super(i3);
        C11883e[] m3737instanceof = c13935e.m3737instanceof(c13935e2, bArr5, c7358e.ad, bArr4);
        C13935e c13935e3 = new C13935e(1);
        c13935e3.m3736import(3);
        c13935e3.m3741private(j);
        c13935e3.m3745super(i3);
        byte[] m3750try = c13935e.m3750try(m3737instanceof, bArr5, bArr4, c13935e3);
        byte[] bArr6 = new byte[32];
        AbstractC3628e.billing(2, 16, bArr6);
        Arrays.fill(bArr6, 20, 32, (byte) 0);
        byte[] m4513e = new C18464e(vip2, AbstractC12442e.license(c7358e.ad), AbstractC12442e.license((byte[]) c11883e.f23815e)).m4513e(i3, j, m3750try);
        int length = m3737instanceof.length;
        byte[][] bArr7 = new byte[length + 2];
        bArr7[0] = appmetrica;
        while (i != m3737instanceof.length) {
            int i4 = i + 1;
            C11883e c11883e2 = m3737instanceof[i];
            bArr7[i4] = AbstractC12442e.adcel((byte[]) c11883e2.f23814e, AbstractC12442e.smaato((byte[][]) c11883e2.f23815e));
            i = i4;
        }
        bArr7[length + 1] = m4513e;
        return AbstractC12442e.smaato(bArr7);
    }

    @Override // defpackage.InterfaceC6045e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        C15412e c15412e;
        Object obj;
        InterfaceC0293e c7952e;
        if (interfaceC3894e instanceof C15412e) {
            C15412e c15412e2 = (C15412e) interfaceC3894e;
            InterfaceC3894e interfaceC3894e2 = c15412e2.f30463e;
            if (c15412e2.f30462e.length > 255) {
                throw new IllegalArgumentException("context too long");
            }
            c15412e = c15412e2;
            interfaceC3894e = interfaceC3894e2;
        } else {
            c15412e = null;
        }
        if (z) {
            this.f32251e = null;
            if (interfaceC3894e instanceof C12219e) {
                C12219e c12219e = (C12219e) interfaceC3894e;
                this.f32250e = (C12222e) c12219e.f24537e;
                this.f32252e = c12219e.f24538e;
            } else {
                this.f32250e = (C12222e) interfaceC3894e;
                this.f32252e = null;
            }
            obj = this.f32250e.f3209e;
        } else {
            C1061e c1061e = (C1061e) interfaceC3894e;
            this.f32251e = c1061e;
            this.f32250e = null;
            this.f32252e = null;
            obj = c1061e.f3209e;
        }
        C4577e c4577e = (C4577e) obj;
        int i = c4577e.metrica;
        if (i == 0) {
            c7952e = c4577e.ad.startsWith("sha2") ? (C4577e.license == c4577e || C4577e.appmetrica == c4577e) ? new C7952e() : new C15708e() : (C4577e.adcel == c4577e || C4577e.mopub == c4577e) ? new C16253e(128) : new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } else if (i == 1) {
            c7952e = new C7952e();
        } else if (i == 2) {
            c7952e = new C15708e();
        } else if (i == 3) {
            c7952e = new C16253e(128);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("unknown parameters type");
            }
            c7952e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        this.f32249e = c7952e;
        try {
            byte[] smaato = AbstractC14846e.ad(c7952e.getAlgorithmName()).smaato();
            int length = c15412e == null ? 0 : c15412e.f30462e.length;
            int i2 = length + 2;
            byte[] bArr = new byte[smaato.length + i2];
            this.f32253e = bArr;
            bArr[0] = 1;
            bArr[1] = (byte) length;
            if (c15412e != null) {
                byte[] bArr2 = c15412e.f30462e;
                if (bArr2.length != length) {
                    throw new IllegalArgumentException("len");
                }
                System.arraycopy(bArr2, 0, bArr, 2, length);
            }
            System.arraycopy(smaato, 0, this.f32253e, i2, smaato.length);
        } catch (IOException e) {
            throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC6045e
    public final void update(byte b) {
        this.f32249e.update(b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC6045e
    public final void update(byte[] bArr, int i, int i2) {
        this.f32249e.update(bArr, i, i2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eَؑٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC6045e
    public final boolean vip(byte[] bArr) {
        byte[] bArr2 = new byte[this.f32249e.getDigestSize()];
        this.f32249e.doFinal(bArr2, 0);
        C1061e c1061e = this.f32251e;
        byte[] bArr3 = this.f32253e;
        C4577e c4577e = (C4577e) c1061e.f3209e;
        C11883e c11883e = c1061e.f3588e;
        AbstractC7629e vip = c4577e.vip.vip();
        vip.billing(c1061e.metrica());
        C13935e c13935e = new C13935e(1);
        int i = vip.yandex;
        int i2 = vip.billing;
        int i3 = ((i2 + 1) * i) + 1 + vip.startapp;
        int i4 = vip.purchase;
        int i5 = vip.metrica;
        int i6 = vip.ad;
        if (((i4 * i5) + i3) * i6 != bArr.length) {
            return false;
        }
        C0912e c0912e = new C0912e(i6, i, i2, i4, vip.adcel, i5, bArr);
        byte[] bArr4 = (byte[]) c0912e.f3332e;
        C11883e[] c11883eArr = (C11883e[]) c0912e.f3331e;
        C10312e[] c10312eArr = (C10312e[]) c0912e.f3333e;
        C15475e metrica = vip.metrica(bArr4, c1061e.metrica(), AbstractC12442e.license((byte[]) c11883e.f23814e), bArr3, bArr2);
        byte[] bArr5 = (byte[]) metrica.metrica;
        long j = metrica.vip;
        int i7 = metrica.ad;
        c13935e.m3736import(3);
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        c13935e.m3745super(i7);
        byte[] m3750try = new C13935e(vip).m3750try(c11883eArr, bArr5, c1061e.metrica(), c13935e);
        c13935e.m3736import(2);
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        c13935e.m3745super(i7);
        return new C18464e(vip, (byte[]) null, c1061e.metrica()).m4498e(m3750try, c10312eArr, c1061e.metrica(), j, i7, AbstractC12442e.license((byte[]) c11883e.f23814e));
    }
}
