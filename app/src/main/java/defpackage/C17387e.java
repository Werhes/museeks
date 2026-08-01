package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17387e implements InterfaceC6882e, InterfaceC0325e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final String f34081e = C5401e.crashlytics("SystemFgDispatcher");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LinkedHashMap f34082e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f34083e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0912e f34084e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C16000e f34085e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f34086e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public SystemForegroundService f34087e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15899e f34088e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final HashSet f34089e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final HashMap f34090e;

    public C17387e(Context context) {
        C15899e billing = C15899e.billing(context);
        this.f34088e = billing;
        C0912e c0912e = billing.purchase;
        this.f34084e = c0912e;
        this.f34086e = null;
        this.f34082e = new LinkedHashMap();
        this.f34089e = new HashSet();
        this.f34090e = new HashMap();
        this.f34085e = new C16000e(context, c0912e, this);
        billing.yandex.ad(this);
    }

    public static Intent license(Context context, String str, C8098e c8098e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c8098e.ad);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c8098e.vip);
        intent.putExtra("KEY_NOTIFICATION", c8098e.metrica);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent vip(Context context, String str, C8098e c8098e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c8098e.ad);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c8098e.vip);
        intent.putExtra("KEY_NOTIFICATION", c8098e.metrica);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.InterfaceC6882e
    public final void ad(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C5401e.loadAd().smaato(f34081e, AbstractC17861e.Signature("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            C15899e c15899e = this.f34088e;
            c15899e.purchase.license(new RunnableC14891e(c15899e, str, true));
        }
    }

    public final void appmetrica(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C5401e loadAd = C5401e.loadAd();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        loadAd.smaato(f34081e, AbstractC17861e.smaato(intExtra2, ")", sb), new Throwable[0]);
        if (notification == null || this.f34087e == null) {
            return;
        }
        C8098e c8098e = new C8098e(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f34082e;
        linkedHashMap.put(stringExtra, c8098e);
        if (TextUtils.isEmpty(this.f34086e)) {
            this.f34086e = stringExtra;
            SystemForegroundService systemForegroundService = this.f34087e;
            systemForegroundService.f616e.post(new RunnableC16525e(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f34087e;
        systemForegroundService2.f616e.post(new RunnableC10028e(systemForegroundService2, intExtra, notification, 4));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((C8098e) ((Map.Entry) it.next()).getValue()).vip;
        }
        C8098e c8098e2 = (C8098e) linkedHashMap.get(this.f34086e);
        if (c8098e2 != null) {
            SystemForegroundService systemForegroundService3 = this.f34087e;
            systemForegroundService3.f616e.post(new RunnableC16525e(systemForegroundService3, c8098e2.ad, c8098e2.metrica, i));
        }
    }

    public final void billing() {
        this.f34087e = null;
        synchronized (this.f34083e) {
            this.f34085e.license();
        }
        this.f34088e.yandex.purchase(this);
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f34083e) {
            try {
                C13394e c13394e = (C13394e) this.f34090e.remove(str);
                if (c13394e != null ? this.f34089e.remove(c13394e) : false) {
                    this.f34085e.metrica(this.f34089e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C8098e c8098e = (C8098e) this.f34082e.remove(str);
        if (str.equals(this.f34086e) && this.f34082e.size() > 0) {
            Iterator it = this.f34082e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f34086e = (String) entry.getKey();
            if (this.f34087e != null) {
                C8098e c8098e2 = (C8098e) entry.getValue();
                SystemForegroundService systemForegroundService = this.f34087e;
                systemForegroundService.f616e.post(new RunnableC16525e(systemForegroundService, c8098e2.ad, c8098e2.metrica, c8098e2.vip));
                SystemForegroundService systemForegroundService2 = this.f34087e;
                systemForegroundService2.f616e.post(new RunnableC9280e(systemForegroundService2, c8098e2.ad, 3));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f34087e;
        if (c8098e == null || systemForegroundService3 == null) {
            return;
        }
        C5401e loadAd = C5401e.loadAd();
        String str2 = f34081e;
        int i = c8098e.ad;
        int i2 = c8098e.vip;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        loadAd.smaato(str2, AbstractC17861e.smaato(i2, ")", sb), new Throwable[0]);
        systemForegroundService3.f616e.post(new RunnableC9280e(systemForegroundService3, c8098e.ad, 3));
    }

    @Override // defpackage.InterfaceC6882e
    public final void purchase(List list) {
    }
}
