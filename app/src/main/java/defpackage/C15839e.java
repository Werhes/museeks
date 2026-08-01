package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15839e extends AbstractC3881e {
    public final Context amazon;
    public final int loadAd;

    public C15839e(Context context) {
        super(new C7507e[1], new C0152e[1]);
        this.amazon = context;
        this.loadAd = -1;
    }

    @Override // defpackage.AbstractC3881e
    public final AbstractC11254e billing() {
        return new C0152e(this);
    }

    @Override // defpackage.AbstractC3881e
    public final C7507e purchase() {
        return new C7507e(1);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Exception, eِؓۜ] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Exception, eِؓۜ] */
    @Override // defpackage.AbstractC3881e
    public final AbstractC1762e startapp(C7507e c7507e, AbstractC11254e abstractC11254e, boolean z) {
        C0152e c0152e = (C0152e) abstractC11254e;
        ByteBuffer byteBuffer = c7507e.f15296e;
        byteBuffer.getClass();
        AbstractC2301e.subscription(byteBuffer.hasArray());
        AbstractC2301e.billing(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.loadAd;
            if (i == -1) {
                Context context = this.amazon;
                if (context != null) {
                    Point isPro = AbstractC9413e.isPro(context);
                    int i2 = isPro.x;
                    int i3 = isPro.y;
                    C16975e c16975e = c7507e.f15297e;
                    if (c16975e != null) {
                        int i4 = c16975e.f33287try;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = c16975e.f33284protected;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            c0152e.f1384e = AbstractC16048e.license(byteBuffer.remaining(), i, byteBuffer.array());
            c0152e.f22622e = c7507e.f15301e;
            return null;
        } catch (C15125e e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Exception, eِؓۜ] */
    @Override // defpackage.AbstractC3881e
    public final AbstractC1762e yandex(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }
}
