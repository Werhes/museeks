package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9246e extends AbstractC9166e {
    public static final String yandex = C5401e.crashlytics("BrdcstRcvrCnstrntTrckr");
    public final C13264e billing;

    public AbstractC9246e(C0912e c0912e, Context context) {
        super(c0912e, context);
        this.billing = new C13264e(3, this);
    }

    @Override // defpackage.AbstractC9166e
    public final void appmetrica() {
        C5401e.loadAd().smaato(yandex, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.vip.unregisterReceiver(this.billing);
    }

    public abstract void billing(Intent intent);

    @Override // defpackage.AbstractC9166e
    public final void license() {
        C5401e.loadAd().smaato(yandex, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.vip.registerReceiver(this.billing, purchase());
    }

    public abstract IntentFilter purchase();
}
