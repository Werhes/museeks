package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15401e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30391e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30392e;

    public /* synthetic */ C15401e(int i, Object obj) {
        this.f30392e = i;
        this.f30391e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f30392e) {
            case 0:
                for (Function1 function1 : (Function1[]) this.f30391e) {
                    int vip = AbstractC0258e.vip((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (vip != 0) {
                        return vip;
                    }
                }
                return 0;
            case 1:
                InterfaceC9595e interfaceC9595e = (InterfaceC9595e) this.f30391e;
                return interfaceC9595e.yandex(obj2) - interfaceC9595e.yandex(obj);
            case 2:
                return ((Number) ((C3450e) this.f30391e).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((Function2) this.f30391e).invoke(obj, obj2)).intValue();
            case 4:
                C1673e c1673e = (C1673e) obj2;
                ((C13875e) this.f30391e).getClass();
                Class cls = ((C1673e) obj).ad.adcel;
                int i = 0;
                int i2 = cls == MediaCodec.class ? 2 : (cls == C9301e.class || cls == C14402e.class) ? 0 : 1;
                Class cls2 = c1673e.ad.adcel;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 != C9301e.class && cls2 != C14402e.class) {
                    i = 1;
                }
                return i2 - i;
            default:
                Rect rect = (Rect) this.f30391e;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
