package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۥۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14373e extends ContentObserver {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14373e(C10017e c10017e) {
        super(null);
        this.ad = 2;
        this.vip = c10017e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14373e(Object obj, Handler handler, int i) {
        super(handler);
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                C14314e c14314e = (C14314e) obj;
                boolean z2 = Settings.System.getInt(c14314e.f28307e, "reduce_animations", 0) == 0;
                if (c14314e.f28310e != null) {
                    C15420e c15420e = AbstractC6731e.ad;
                    AbstractC5336e.purchase(AbstractC9743e.ad(AbstractC1497e.ad), null, 0, new C11441e(c14314e, z2, null, 2), 3);
                    return;
                }
                return;
            case 1:
            default:
                super.onChange(z);
                return;
            case 2:
                ((AtomicBoolean) ((C10017e) obj).f19786e).set(true);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.ad) {
            case 1:
                ((C14137e) this.vip).amazon(Unit.INSTANCE);
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }
}
