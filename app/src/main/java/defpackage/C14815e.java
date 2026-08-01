package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.security.SecureRandom;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٛؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14815e implements InterfaceC4243e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f29336e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f29337e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f29338e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f29339e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f29340e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f29341e;

    public /* synthetic */ C14815e(TextView textView) {
        this.f29340e = null;
        this.f29338e = null;
        this.f29337e = false;
        this.f29339e = false;
        this.f29341e = textView;
    }

    public C14815e(InterfaceC4243e interfaceC4243e) {
        this.f29340e = interfaceC4243e;
        this.f29336e = AbstractC0361e.license("org.bouncycastle.pkcs1.not_strict", true) ? false : !AbstractC0361e.license("org.bouncycastle.pkcs1.strict", false);
    }

    public C14815e(AbstractC4455e abstractC4455e, Object obj, boolean z, InterfaceC1589e interfaceC1589e, boolean z2) {
        this.f29341e = abstractC4455e;
        this.f29337e = z;
        this.f29340e = interfaceC1589e;
        this.f29339e = z2;
        this.f29338e = obj;
        this.f29336e = true;
    }

    public C14815e(X509CRLSelector x509CRLSelector) {
        this.f29337e = false;
        this.f29339e = false;
        this.f29340e = null;
        this.f29338e = null;
        this.f29336e = false;
        this.f29341e = (CRLSelector) x509CRLSelector.clone();
    }

    public void ad() {
        CompoundButton compoundButton = (CompoundButton) this.f29341e;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f29337e || this.f29339e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f29337e) {
                    mutate.setTintList((ColorStateList) this.f29340e);
                }
                if (this.f29339e) {
                    mutate.setTintMode((PorterDuff.Mode) this.f29338e);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    @Override // defpackage.InterfaceC4243e
    public int getInputBlockSize() {
        int inputBlockSize = ((InterfaceC4243e) this.f29340e).getInputBlockSize();
        return this.f29337e ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // defpackage.InterfaceC4243e
    public int getOutputBlockSize() {
        int outputBlockSize = ((InterfaceC4243e) this.f29340e).getOutputBlockSize();
        return this.f29337e ? outputBlockSize : outputBlockSize - 10;
    }

    @Override // defpackage.InterfaceC4243e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        AbstractC9027e abstractC9027e;
        InterfaceC4243e interfaceC4243e = (InterfaceC4243e) this.f29340e;
        if (interfaceC3894e instanceof C12219e) {
            C12219e c12219e = (C12219e) interfaceC3894e;
            this.f29341e = c12219e.f24538e;
            abstractC9027e = (AbstractC9027e) c12219e.f24537e;
        } else {
            abstractC9027e = (AbstractC9027e) interfaceC3894e;
            if (!abstractC9027e.f18083e && z) {
                this.f29341e = AbstractC9915e.vip();
            }
        }
        interfaceC4243e.init(z, interfaceC3894e);
        this.f29339e = abstractC9027e.f18083e;
        this.f29337e = z;
        this.f29338e = new byte[interfaceC4243e.getOutputBlockSize()];
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void license(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f29341e
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = defpackage.AbstractC6062e.smaato
            eؚؒٗ r7 = defpackage.C0912e.advert(r0, r9, r3, r10)
            java.lang.Object r0 = r7.f3331e
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.f3331e
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            defpackage.AbstractC2016e.amazon(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC4628e.purchase(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = defpackage.AbstractC4628e.purchase(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.purchase(r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.AbstractC13982e.metrica(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.amazon()
            return
        L7b:
            r7.amazon()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14815e.license(android.util.AttributeSet, int):void");
    }

    public Object metrica() {
        if (this.f29337e) {
            return null;
        }
        Object obj = this.f29338e;
        if (obj != null) {
            return obj;
        }
        AbstractC1889e.vip("Unexpected form of a provided value");
        throw new C14803e(9);
    }

    @Override // defpackage.InterfaceC4243e
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int length;
        InterfaceC4243e interfaceC4243e = (InterfaceC4243e) this.f29340e;
        if (this.f29337e) {
            if (i2 > getInputBlockSize()) {
                throw new IllegalArgumentException("input data too large");
            }
            int inputBlockSize = interfaceC4243e.getInputBlockSize();
            byte[] bArr2 = new byte[inputBlockSize];
            if (this.f29339e) {
                bArr2[0] = 1;
                for (int i5 = 1; i5 != (inputBlockSize - i2) - 1; i5++) {
                    bArr2[i5] = -1;
                }
            } else {
                ((SecureRandom) this.f29341e).nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i6 = 1; i6 != (inputBlockSize - i2) - 1; i6++) {
                    while (bArr2[i6] == 0) {
                        bArr2[i6] = (byte) ((SecureRandom) this.f29341e).nextInt();
                    }
                }
            }
            int i7 = inputBlockSize - i2;
            bArr2[i7 - 1] = 0;
            System.arraycopy(bArr, i, bArr2, i7, i2);
            return interfaceC4243e.processBlock(bArr2, 0, inputBlockSize);
        }
        int outputBlockSize = interfaceC4243e.getOutputBlockSize();
        byte[] processBlock = interfaceC4243e.processBlock(bArr, i, i2);
        boolean z = this.f29336e & (processBlock.length != outputBlockSize);
        byte[] bArr3 = processBlock.length < outputBlockSize ? (byte[]) this.f29338e : processBlock;
        if (this.f29339e) {
            int i8 = -((bArr3[0] & 255) ^ 2);
            i3 = 0;
            int i9 = 0;
            for (int i10 = 1; i10 < bArr3.length; i10++) {
                int i11 = ((bArr3[i10] & 255) - 1) >> 31;
                i3 ^= ((~i9) & i10) & i11;
                i9 |= i11;
            }
            i4 = i8 | (i3 - 9);
            length = bArr3.length;
        } else {
            int i12 = -((bArr3[0] & 255) ^ 1);
            i3 = 0;
            int i13 = 0;
            for (int i14 = 1; i14 < bArr3.length; i14++) {
                int i15 = bArr3[i14] & 255;
                int i16 = (i15 - 1) >> 31;
                i3 ^= ((~i13) & i14) & i16;
                i13 |= i16;
                i12 |= ~((((i15 ^ 255) - 1) >> 31) | i13);
            }
            i4 = i12 | (i3 - 9);
            length = bArr3.length;
        }
        int i17 = (i4 >> 31) | ((length - 1) - i3);
        try {
            if (i17 < 0) {
                throw new Exception("block incorrect");
            }
            if (z) {
                throw new Exception("block incorrect size");
            }
            byte[] bArr4 = new byte[i17];
            System.arraycopy(bArr3, bArr3.length - i17, bArr4, 0, i17);
            return bArr4;
        } finally {
            Arrays.fill(processBlock, (byte) 0);
            byte[] bArr5 = (byte[]) this.f29338e;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - processBlock.length), (byte) 0);
        }
    }

    public void vip() {
        C12085e c12085e = (C12085e) this.f29341e;
        Drawable checkMarkDrawable = c12085e.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f29337e || this.f29339e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f29337e) {
                    mutate.setTintList((ColorStateList) this.f29340e);
                }
                if (this.f29339e) {
                    mutate.setTintMode((PorterDuff.Mode) this.f29338e);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c12085e.getDrawableState());
                }
                c12085e.setCheckMarkDrawable(mutate);
            }
        }
    }
}
