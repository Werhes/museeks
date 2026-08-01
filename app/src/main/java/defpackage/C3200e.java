package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3200e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2316e f7316e;

    public C3200e(C2316e c2316e) {
        super(10);
        this.f7316e = c2316e;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object mo1317e(Object obj) {
        C17856e purchase;
        InterfaceC2839e c5903e;
        C2316e c2316e = this.f7316e;
        C3098e c3098e = (C3098e) obj;
        Context vip = c2316e.vip();
        String str = true != AbstractC4214e.metrica() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (AbstractC5797e.class) {
            byte b = (byte) (((byte) 1) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            purchase = AbstractC5797e.purchase(new C6758e(str, 1));
        }
        C7895e c7895e = C5903e.f12454e;
        if (C0781e.ad(vip, ModuleDescriptor.MODULE_ID) <= 0) {
            C17991e.vip.getClass();
            if (C17991e.ad(vip) < 204500000) {
                c5903e = new C12344e(vip, c3098e, purchase);
                return new C1729e(c2316e, c3098e, c5903e, purchase);
            }
        }
        c5903e = new C5903e(vip, c3098e, purchase);
        return new C1729e(c2316e, c3098e, c5903e, purchase);
    }
}
