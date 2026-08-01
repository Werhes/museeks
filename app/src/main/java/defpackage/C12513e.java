package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12513e implements InterfaceC6744e {
    public static final HashMap purchase;
    public final C3909e appmetrica;
    public final InterfaceC12424e license;
    public final InterfaceC6744e metrica;

    static {
        HashMap hashMap = new HashMap();
        purchase = hashMap;
        hashMap.put(1, C18525e.adcel);
        hashMap.put(8, C18525e.yandex);
        hashMap.put(6, C18525e.billing);
        hashMap.put(5, C18525e.purchase);
        hashMap.put(4, C18525e.appmetrica);
        hashMap.put(0, C18525e.startapp);
    }

    public C12513e(InterfaceC6744e interfaceC6744e, InterfaceC12424e interfaceC12424e, C3909e c3909e) {
        this.metrica = interfaceC6744e;
        this.license = interfaceC12424e;
        this.appmetrica = c3909e;
    }

    @Override // defpackage.InterfaceC6744e
    public final boolean ad(int i) {
        if (!this.metrica.ad(i)) {
            return false;
        }
        C18525e c18525e = (C18525e) purchase.get(Integer.valueOf(i));
        if (c18525e == null) {
            return true;
        }
        Iterator it = this.appmetrica.metrica(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.ad(this.license, c18525e) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).vip())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC6744e
    public final InterfaceC16104e vip(int i) {
        if (ad(i)) {
            return this.metrica.vip(i);
        }
        return null;
    }
}
