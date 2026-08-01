package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10888e {
    public static Bitmap ad;

    public static float ad(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static C11557e appmetrica(C11467e c11467e, C11557e c11557e, C11557e c11557e2, AbstractC11540e abstractC11540e) {
        if (c11557e == null) {
            throw new NullPointerException("left == null");
        }
        int i = c11557e.f23217e;
        if (c11557e2 == null) {
            throw new NullPointerException("right == null");
        }
        if (i != c11557e2.f23217e) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] bArr = (byte[]) c11467e.f23071e;
        C13572e c13572e = (C13572e) c11467e.f23070e;
        byte[] license = AbstractC12442e.license(bArr);
        if (abstractC11540e instanceof C3802e) {
            C3802e c3802e = (C3802e) abstractC11540e;
            C11145e c11145e = new C11145e(0);
            c11145e.metrica = c3802e.ad;
            c11145e.vip = c3802e.vip;
            c11145e.appmetrica = c3802e.appmetrica;
            c11145e.purchase = c3802e.purchase;
            c11145e.billing = c3802e.billing;
            c11145e.license = 0;
            abstractC11540e = new C3802e(c11145e);
        } else if (abstractC11540e instanceof C15281e) {
            C15281e c15281e = (C15281e) abstractC11540e;
            C7017e c7017e = new C7017e();
            c7017e.metrica = c15281e.ad;
            c7017e.vip = c15281e.vip;
            c7017e.appmetrica = c15281e.appmetrica;
            c7017e.purchase = c15281e.purchase;
            c7017e.license = 0;
            abstractC11540e = new C15281e(c7017e);
        }
        byte[] license2 = c13572e.license(license, abstractC11540e.ad());
        if (abstractC11540e instanceof C3802e) {
            C3802e c3802e2 = (C3802e) abstractC11540e;
            C11145e c11145e2 = new C11145e(0);
            c11145e2.metrica = c3802e2.ad;
            c11145e2.vip = c3802e2.vip;
            c11145e2.appmetrica = c3802e2.appmetrica;
            c11145e2.purchase = c3802e2.purchase;
            c11145e2.billing = c3802e2.billing;
            c11145e2.license = 1;
            abstractC11540e = new C3802e(c11145e2);
        } else if (abstractC11540e instanceof C15281e) {
            C15281e c15281e2 = (C15281e) abstractC11540e;
            C7017e c7017e2 = new C7017e();
            c7017e2.metrica = c15281e2.ad;
            c7017e2.vip = c15281e2.vip;
            c7017e2.appmetrica = c15281e2.appmetrica;
            c7017e2.purchase = c15281e2.purchase;
            c7017e2.license = 1;
            abstractC11540e = new C15281e(c7017e2);
        }
        byte[] license3 = c13572e.license(license, abstractC11540e.ad());
        if (abstractC11540e instanceof C3802e) {
            C3802e c3802e3 = (C3802e) abstractC11540e;
            C11145e c11145e3 = new C11145e(0);
            c11145e3.metrica = c3802e3.ad;
            c11145e3.vip = c3802e3.vip;
            c11145e3.appmetrica = c3802e3.appmetrica;
            c11145e3.purchase = c3802e3.purchase;
            c11145e3.billing = c3802e3.billing;
            c11145e3.license = 2;
            abstractC11540e = new C3802e(c11145e3);
        } else if (abstractC11540e instanceof C15281e) {
            C15281e c15281e3 = (C15281e) abstractC11540e;
            C7017e c7017e3 = new C7017e();
            c7017e3.metrica = c15281e3.ad;
            c7017e3.vip = c15281e3.vip;
            c7017e3.appmetrica = c15281e3.appmetrica;
            c7017e3.purchase = c15281e3.purchase;
            c7017e3.license = 2;
            abstractC11540e = new C15281e(c7017e3);
        }
        byte[] license4 = c13572e.license(license, abstractC11540e.ad());
        int i2 = ((C11226e) c11467e.f23072e).vip;
        int i3 = i2 * 2;
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (AbstractC16947e.license(c11557e.f23216e)[i4] ^ license3[i4]);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5 + i2] = (byte) (AbstractC16947e.license(c11557e2.f23216e)[i5] ^ license4[i5]);
        }
        int length = license2.length;
        int i6 = c13572e.f26879e;
        if (length != i6) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i3 == i6 * 2) {
            return new C11557e(i, c13572e.adcel(license2, 1, bArr2));
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public static C11557e license(C11467e c11467e, C17974e c17974e, C3802e c3802e) {
        int i;
        long j;
        double d;
        int i2;
        int i3;
        int i4;
        int i5 = ((C11226e) c11467e.f23072e).license;
        byte[][] appmetrica = AbstractC16947e.appmetrica((byte[][]) c17974e.f35233e);
        C11557e[] c11557eArr = new C11557e[appmetrica.length];
        for (int i6 = 0; i6 < appmetrica.length; i6++) {
            c11557eArr[i6] = new C11557e(0, appmetrica[i6]);
        }
        C11145e c11145e = new C11145e(0);
        c11145e.metrica = c3802e.ad;
        c11145e.vip = c3802e.vip;
        c11145e.appmetrica = c3802e.appmetrica;
        c11145e.purchase = 0;
        c11145e.billing = c3802e.billing;
        c11145e.license = c3802e.license;
        C3802e c3802e2 = new C3802e(c11145e);
        while (i5 > 1) {
            int i7 = 0;
            while (true) {
                i = c3802e2.license;
                j = c3802e2.vip;
                d = i5 / 2;
                int floor = (int) Math.floor(d);
                i2 = c3802e2.purchase;
                i3 = c3802e2.appmetrica;
                i4 = c3802e2.ad;
                if (i7 >= floor) {
                    break;
                }
                C11145e c11145e2 = new C11145e(0);
                c11145e2.metrica = i4;
                c11145e2.vip = j;
                c11145e2.appmetrica = i3;
                c11145e2.purchase = i2;
                c11145e2.billing = i7;
                c11145e2.license = i;
                C3802e c3802e3 = new C3802e(c11145e2);
                int i8 = i7 * 2;
                c11557eArr[i7] = appmetrica(c11467e, c11557eArr[i8], c11557eArr[i8 + 1], c3802e3);
                i7++;
                c3802e2 = c3802e3;
            }
            if (i5 % 2 == 1) {
                c11557eArr[(int) Math.floor(d)] = c11557eArr[i5 - 1];
            }
            i5 = (int) Math.ceil(i5 / 2.0d);
            C11145e c11145e3 = new C11145e(0);
            c11145e3.metrica = i4;
            c11145e3.vip = j;
            c11145e3.appmetrica = i3;
            c11145e3.purchase = i2 + 1;
            c11145e3.billing = c3802e2.billing;
            c11145e3.license = i;
            c3802e2 = new C3802e(c11145e3);
        }
        return c11557eArr[0];
    }

    public static Bitmap metrica(Activity activity) {
        try {
            InputStream open = activity.getAssets().open("radial_gradient_dithered_circle_2048.gm");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap decodeStream = BitmapFactory.decodeStream(open, null, options);
            if (decodeStream == null) {
                Bitmap createBitmap = Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888);
                Log.e("CircleDrawableCache", "made but null bitmap. please checking..");
                open.close();
                return createBitmap;
            }
            int width = decodeStream.getWidth() * decodeStream.getHeight();
            int[] iArr = new int[width];
            decodeStream.getPixels(iArr, 0, decodeStream.getWidth(), 0, 0, decodeStream.getWidth(), decodeStream.getHeight());
            for (int i = 0; i < width; i++) {
                iArr[i] = ((iArr[i] << 8) & (-16777216)) | 16777215;
            }
            decodeStream.recycle();
            Bitmap createBitmap2 = Bitmap.createBitmap(decodeStream.getWidth(), decodeStream.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap2.setPixels(iArr, 0, createBitmap2.getWidth(), 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap2, decodeStream.getWidth() / 2, decodeStream.getHeight() / 2, false);
            if (createScaledBitmap != null) {
                open.close();
            }
            return createScaledBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract String vip();
}
