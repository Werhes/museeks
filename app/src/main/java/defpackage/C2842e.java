package defpackage;

import android.content.ClipData;
import android.os.Build;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2842e implements InterfaceC17155e {
    public final C16615e ad;

    public C2842e(C16615e c16615e) {
        this.ad = c16615e;
    }

    public final Unit ad(C13590e c13590e) {
        C16615e c16615e = this.ad;
        if (c13590e != null) {
            c16615e.ad().setPrimaryClip(c13590e.ad);
        } else if (Build.VERSION.SDK_INT >= 28) {
            AbstractC17305e.purchase(c16615e.ad());
        } else {
            c16615e.ad().setPrimaryClip(ClipData.newPlainText(BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
        return Unit.INSTANCE;
    }
}
