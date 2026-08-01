package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6402e implements InterfaceC7273e {
    public final /* synthetic */ int ad;
    public final Object metrica;
    public final C6302e vip;

    public /* synthetic */ C6402e(Object obj, C6302e c6302e, int i) {
        this.ad = i;
        this.metrica = obj;
        this.vip = c6302e;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [eؗٔۙ, eِٖۢ, java.lang.Object] */
    @Override // defpackage.InterfaceC7273e
    public final Object ad(C0739e c0739e) {
        int i = this.ad;
        Object obj = this.metrica;
        C6302e c6302e = this.vip;
        switch (i) {
            case 0:
                ?? obj2 = new Object();
                obj2.m4136write((byte[]) obj);
                return new C16569e(AbstractC0436e.metrica(obj2, c6302e.purchase), null, 2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new C16569e(new C7769e(new C13197e(new C3713e(byteBuffer)), c6302e.purchase, new C11417e(byteBuffer)), null, 2);
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC13427e.ad;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof C2955e);
                if (z) {
                    drawable = new BitmapDrawable(c6302e.ad.getResources(), AbstractC3199e.m1315this(drawable, AbstractC15659e.vip(c6302e), c6302e.vip, c6302e.metrica, (C16320e) AbstractC8306e.license(c6302e, AbstractC2182e.vip), c6302e.license == 2));
                }
                return new C6164e(AbstractC15143e.vip(drawable), z, 2);
        }
    }
}
