package com.werhes.museeks.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6731e;
import defpackage.AbstractC7185e;
import defpackage.C0086e;
import defpackage.C0609e;
import defpackage.C10981e;
import defpackage.C12309e;
import defpackage.C13029e;
import defpackage.C13749e;
import defpackage.C14027e;
import defpackage.C14164e;
import defpackage.C15409e;
import defpackage.C2046e;
import defpackage.C4561e;
import defpackage.C6046e;
import defpackage.C7236e;
import defpackage.C7602e;
import defpackage.C8515e;
import defpackage.EnumC2821e;
import defpackage.InterfaceC1686e;
import defpackage.InterfaceC5083e;
import defpackage.InterfaceC8614e;
import kotlin.Metadata;
import kotlin.Unit;
import com.werhes.museeks.R;
import com.werhes.museeks.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkx/activity/ShortcutBridgeActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShortcutBridgeActivity extends Activity {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ int f36550e = 0;

    public static final Object ad(ShortcutBridgeActivity shortcutBridgeActivity, InterfaceC1686e interfaceC1686e, AbstractC7185e abstractC7185e) {
        C15409e c15409e = C15409e.ad;
        c15409e.getClass();
        C12309e c12309e = C15409e.purchase;
        InterfaceC8614e interfaceC8614e = C15409e.vip[0];
        Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(new C0086e(null, 0L, null, false, false, ((Boolean) c12309e.tapsense(c15409e)).booleanValue(), 95), interfaceC1686e, (InterfaceC5083e) null, 1), abstractC7185e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (advert != enumC2821e) {
            advert = Unit.INSTANCE;
        }
        return advert == enumC2821e ? advert : Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) AppActivity.class);
        intent.putExtra("from_shortcut", true);
        intent.setAction(getIntent().getAction());
        startActivity(intent);
        if (getIntent().hasExtra("from_shortcut")) {
            Toast.makeText(this, R.string.shortcut_load, 1).show();
        }
        String action = getIntent().getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2005101147:
                    if (action.equals("vkx_shortcut_cache")) {
                        vip(C4561e.INSTANCE);
                        break;
                    }
                    break;
                case -1595454980:
                    if (action.equals("vkx_shortcut_recomm")) {
                        C14027e.ad.getClass();
                        C13029e c13029e = new C13029e(0, 200, C14027e.metrica(), (String) null);
                        C10981e c10981e = new C10981e(1, this, ShortcutBridgeActivity.class, "onShortcutError", "onShortcutError(Ljava/lang/Throwable;)V", 0, 0, 6);
                        C13749e c13749e = new C13749e(25, this);
                        C0609e c0609e = new C0609e(11, c13029e);
                        C2046e c2046e = new C2046e(0, c13749e);
                        VKXApplication vKXApplication = VKXApplication.f36528e;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        AbstractC5336e.purchase(vKXApplication, null, 0, new C14164e(c2046e, c13029e, c10981e, c0609e, (InterfaceC5083e) null), 3);
                        break;
                    }
                    break;
                case 601273704:
                    if (action.equals("vkx_shortcut_lib")) {
                        C8515e.Companion.getClass();
                        C14027e.ad.getClass();
                        vip(new C8515e(String.valueOf(C14027e.metrica()), C14027e.license()));
                        break;
                    }
                    break;
                case 1553615228:
                    if (action.equals("vkx_shortcut_catalog")) {
                        VKXApplication vKXApplication2 = VKXApplication.f36528e;
                        if (vKXApplication2 == null) {
                            vKXApplication2 = null;
                        }
                        AbstractC5336e.purchase(vKXApplication2, null, 0, new C7236e(this, (InterfaceC5083e) null, 18), 3);
                        break;
                    }
                    break;
            }
            finish();
        }
        finish();
    }

    public final void vip(InterfaceC1686e interfaceC1686e) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, null, 0, new C7602e(this, interfaceC1686e, null, 9), 3);
    }
}
