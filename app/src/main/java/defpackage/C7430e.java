package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7430e implements InterfaceC5355e {
    public final InterfaceC8910e ad;
    public final C5183e license;
    public final C12708e metrica;
    public final C6302e vip;

    public C7430e(InterfaceC8910e interfaceC8910e, C6302e c6302e, C12708e c12708e, C5183e c5183e) {
        this.ad = interfaceC8910e;
        this.vip = c6302e;
        this.metrica = c12708e;
        this.license = c5183e;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eٌؚۗ, eٌٔ۠, eّؔۜ] */
    public static C7132e vip(C7430e c7430e) {
        C15874e c15874e;
        Context context;
        boolean z;
        boolean z2;
        Bitmap createBitmap;
        int i;
        int i2;
        int min;
        double max;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        C6302e c6302e = c7430e.vip;
        ?? abstractC8548e = new AbstractC8548e(c7430e.ad.mo2321e());
        C13197e c13197e = new C13197e(abstractC8548e);
        options.inJustDecodeBounds = true;
        int i4 = 4;
        BitmapFactory.decodeStream(new C7404e(i4, c13197e.peek()), null, options);
        Exception exc = abstractC8548e.f29737e;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = AbstractC4374e.ad;
        String str = options.outMimeType;
        c7430e.license.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            C0490e c0490e = new C0490e(new C4620e(new C7404e(i4, c13197e.peek())));
            int metrica = c0490e.metrica(1, "Orientation");
            boolean z3 = metrica == 2 || metrica == 7 || metrica == 4 || metrica == 5;
            switch (c0490e.metrica(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            c15874e = new C15874e(z3, i3);
        } else {
            c15874e = C15874e.metrica;
        }
        int i5 = c15874e.vip;
        boolean z4 = c15874e.ad;
        Exception exc2 = abstractC8548e.f29737e;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && AbstractC15659e.metrica(c6302e) != null) {
            options.inPreferredColorSpace = (ColorSpace) AbstractC8306e.license(c6302e, AbstractC15659e.metrica);
        }
        boolean booleanValue = ((Boolean) AbstractC8306e.license(c6302e, AbstractC15659e.license)).booleanValue();
        Context context2 = c6302e.ad;
        options.inPremultiplied = booleanValue;
        Bitmap.Config config = (Bitmap.Config) AbstractC8306e.license(c6302e, AbstractC15659e.vip);
        if ((z4 || i5 > 0) && (config == null || AbstractC11815e.firebase(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) AbstractC8306e.license(c6302e, AbstractC15659e.billing)).booleanValue() && config == Bitmap.Config.ARGB_8888 && AbstractC7890e.billing(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i6 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i7 = options.outWidth;
        if (i7 <= 0 || (i = options.outHeight) <= 0) {
            context = context2;
            z = z4;
            options.inSampleSize = 1;
            z2 = false;
            options.inScaled = false;
        } else {
            int i8 = (i5 == 90 || i5 == 270) ? i : i7;
            if (i5 != 90 && i5 != 270) {
                i7 = i;
            }
            C16320e c16320e = c6302e.vip;
            int i9 = c6302e.metrica;
            C12916e c12916e = AbstractC2182e.vip;
            long ad = AbstractC2774e.ad(i8, i7, c16320e, i9, (C16320e) AbstractC8306e.license(c6302e, c12916e));
            int i10 = (int) (ad >> 32);
            int i11 = (int) (ad & 4294967295L);
            int highestOneBit = Integer.highestOneBit(i8 / i10);
            int highestOneBit2 = Integer.highestOneBit(i7 / i11);
            int m2467class = AbstractC8703e.m2467class(i9);
            context = context2;
            if (m2467class != 0) {
                i2 = 1;
                if (m2467class != 1) {
                    throw new C14803e(10);
                }
                min = Math.max(highestOneBit, highestOneBit2);
            } else {
                i2 = 1;
                min = Math.min(highestOneBit, highestOneBit2);
            }
            if (min < i2) {
                min = 1;
            }
            options.inSampleSize = min;
            z = z4;
            double d = min;
            double d2 = i8 / d;
            double d3 = i7 / d;
            C16320e c16320e2 = (C16320e) AbstractC8306e.license(c6302e, c12916e);
            double d4 = i10 / d2;
            double d5 = i11 / d3;
            int m2467class2 = AbstractC8703e.m2467class(i9);
            if (m2467class2 == 0) {
                max = Math.max(d4, d5);
            } else {
                if (m2467class2 != 1) {
                    throw new C14803e(10);
                }
                max = Math.min(d4, d5);
            }
            if (c16320e2.ad instanceof C3645e) {
                double d6 = ((C3645e) r5).ad / d2;
                if (max > d6) {
                    max = d6;
                }
            }
            if (c16320e2.vip instanceof C3645e) {
                double d7 = ((C3645e) r0).ad / d3;
                if (max > d7) {
                    max = d7;
                }
            }
            if (c6302e.license == 2 && max > 1.0d) {
                max = 1.0d;
            }
            boolean z5 = max == 1.0d;
            options.inScaled = !z5;
            if (!z5) {
                if (max > 1.0d) {
                    options.inDensity = AbstractC1561e.license(Alert.DURATION_SHOW_INDEFINITELY / max);
                    options.inTargetDensity = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    options.inDensity = Alert.DURATION_SHOW_INDEFINITELY;
                    options.inTargetDensity = AbstractC1561e.license(Alert.DURATION_SHOW_INDEFINITELY * max);
                }
            }
            z2 = false;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(new C7404e(4, c13197e), null, options);
            c13197e.close();
            Exception exc3 = abstractC8548e.f29737e;
            if (exc3 != null) {
                throw exc3;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z || i5 > 0) {
                Matrix matrix = new Matrix();
                float width = decodeStream.getWidth() / 2.0f;
                float height = decodeStream.getHeight() / 2.0f;
                if (z) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i5 > 0) {
                    matrix.postRotate(i5, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i5 == 90 || i5 == 270) {
                    int height2 = decodeStream.getHeight();
                    int width2 = decodeStream.getWidth();
                    Bitmap.Config config4 = decodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = decodeStream.getWidth();
                    int height3 = decodeStream.getHeight();
                    Bitmap.Config config5 = decodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(createBitmap).drawBitmap(decodeStream, matrix, AbstractC4374e.ad);
                decodeStream.recycle();
                decodeStream = createBitmap;
            }
            return new C7132e(AbstractC15143e.vip(new BitmapDrawable(context.getResources(), decodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z2);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r9.ad(r0) == r4) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v3, types: [eؓۢۡ] */
    @Override // defpackage.InterfaceC5355e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC5083e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C7907e
            if (r0 == 0) goto L13
            r0 = r9
            eًٍْ r0 = (defpackage.C7907e) r0
            int r1 = r0.f15990e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15990e = r1
            goto L1a
        L13:
            eًٍْ r0 = new eًٍْ
            eُؑ۠ r9 = (defpackage.AbstractC10731e) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f15988e
            int r1 = r0.f15990e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            eؓۢۡ r0 = r0.f15989e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6e
        L2e:
            r9 = move-exception
            goto L7c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            eؓۢۡ r1 = r0.f15989e
            defpackage.AbstractC2003e.purchase(r9)
            r9 = r1
            goto L4f
        L3f:
            defpackage.AbstractC2003e.purchase(r9)
            eّۘۥ r9 = r8.metrica
            r0.f15989e = r9
            r0.f15990e = r3
            java.lang.Object r1 = r9.ad(r0)
            if (r1 != r4) goto L4f
            goto L6a
        L4f:
            eٔؖۘ r1 = new eٔؖۘ     // Catch: java.lang.Throwable -> L7a
            r3 = 19
            r1.<init>(r3, r8)     // Catch: java.lang.Throwable -> L7a
            r0.f15989e = r9     // Catch: java.lang.Throwable -> L7a
            r0.f15990e = r2     // Catch: java.lang.Throwable -> L7a
            eؔٚٞ r2 = defpackage.C2693e.f6576e     // Catch: java.lang.Throwable -> L7a
            eُؗٓ r3 = new eُؗٓ     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            r6 = 23
            r3.<init>(r1, r5, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = defpackage.AbstractC5336e.advert(r2, r3, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r4) goto L6b
        L6a:
            return r4
        L6b:
            r7 = r0
            r0 = r9
            r9 = r7
        L6e:
            eؚْٛ r9 = (defpackage.C7132e) r9     // Catch: java.lang.Throwable -> L2e
            eَ٘ؔ r0 = (defpackage.C17663e) r0
            r0.metrica()
            return r9
        L76:
            r7 = r0
            r0 = r9
            r9 = r7
            goto L7c
        L7a:
            r0 = move-exception
            goto L76
        L7c:
            eَ٘ؔ r0 = (defpackage.C17663e) r0
            r0.metrica()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7430e.ad(eًؗۖ):java.lang.Object");
    }
}
