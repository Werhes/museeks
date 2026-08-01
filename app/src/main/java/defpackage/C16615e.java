package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16615e implements InterfaceC16879e {
    public final Context ad;
    public ClipboardManager vip;

    public C16615e(Context context) {
        this.ad = context;
    }

    public final ClipboardManager ad() {
        ClipboardManager clipboardManager = this.vip;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.ad.getSystemService("clipboard");
        this.vip = clipboardManager2;
        return clipboardManager2;
    }
}
