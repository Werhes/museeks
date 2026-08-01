package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۦۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11399e implements InterfaceC8223e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f22922e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22923e;

    public /* synthetic */ C11399e(int i, Object obj) {
        this.f22923e = i;
        this.f22922e = obj;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        int i = this.f22923e;
        Object obj2 = this.f22922e;
        switch (i) {
            case 0:
                Context context = ((C17148e) obj2).f33633e;
                String str = AbstractC9413e.ad;
                int generateAudioSessionId = AbstractC17305e.amazon(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                return Integer.valueOf(generateAudioSessionId);
            case 1:
                C4361e c4361e = (C4361e) obj;
                ((C15789e) obj2).getClass();
                return c4361e;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                C15574e c15574e = (C15574e) ((C10312e) obj2).f20360e;
                if (!c15574e.ad(Math.max(height, width))) {
                    return bitmap;
                }
                if (c15574e.ad(height)) {
                    height--;
                }
                if (c15574e.ad(width)) {
                    width--;
                }
                return AbstractC16048e.tapsense(Bitmap.createScaledBitmap(bitmap, width, height, true));
            case 3:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i2 = ((C13572e) obj2).f26879e;
                if (width2 > i2 || bitmap2.getHeight() > i2) {
                    float f = i2;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return AbstractC16048e.tapsense(bitmap2);
            default:
                C17790e c17790e = (C17790e) obj2;
                C13843e c13843e = (C13843e) obj;
                C13264e c13264e = (C13264e) c17790e.f34883e;
                if (c13264e != null) {
                    try {
                        ((Context) c17790e.f34879e).unregisterReceiver(c13264e);
                    } catch (RuntimeException e) {
                        AbstractC2803e.amazon("StreamVolumeManager", "Error unregistering stream volume receiver", e);
                    }
                    c17790e.f34883e = null;
                }
                return c13843e;
        }
    }
}
