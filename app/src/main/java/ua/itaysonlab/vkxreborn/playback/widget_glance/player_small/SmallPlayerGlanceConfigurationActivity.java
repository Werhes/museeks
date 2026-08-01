package com.werhes.museeksreborn.playback.widget_glance.player_small;

import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractActivityC15824e;
import defpackage.AbstractC11167e;
import defpackage.AbstractC11310e;
import defpackage.C0205e;
import defpackage.C10838e;
import defpackage.C1890e;
import defpackage.C2892e;
import defpackage.C6029e;
import defpackage.C7249e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/playback/widget_glance/player_small/SmallPlayerGlanceConfigurationActivity;", "Leٕۤٓ;", "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SmallPlayerGlanceConfigurationActivity extends AbstractActivityC15824e {

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final /* synthetic */ int f36756e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C6029e f36757e;

    @Override // defpackage.AbstractActivityC15824e, defpackage.AbstractActivityC3684e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("appWidgetId", 0);
        setResult(0, new Intent().putExtra("appWidgetId", i));
        if (i == 0) {
            finish();
            return;
        }
        if (new C1890e(this).vip.getAppWidgetInfo(i) == null) {
            throw new IllegalArgumentException("Invalid AppWidget ID.");
        }
        C10838e c10838e = new C10838e(i);
        new C1890e(this);
        C6029e c6029e = new C6029e(this, c10838e);
        this.f36757e = c6029e;
        int i2 = AbstractC11167e.ad;
        AbstractC11167e.ad(this, C7249e.vip(0, 0), C7249e.vip(AbstractC11167e.ad, AbstractC11167e.vip));
        AbstractC11310e.ad(this, new C2892e(-1814777608, true, new C0205e(c6029e, this, i, 19)));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f36757e = null;
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
