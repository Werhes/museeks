package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC6627e extends DialogC11829e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public RelativeLayout f13673e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public TextView f13674e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public ArrayList f13675e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C13264e f13676e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public TextView f13677e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public ProgressBar f13678e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public Button f13679e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public TextView f13680e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public LinearLayout f13681e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0132e f13682e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public TextView f13683e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f13684e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public ListView f13685e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public long f13686e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C0056e f13687e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final HandlerC17797e f13688e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C10085e f13689e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C15971e f13690e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC6627e(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = defpackage.AbstractC12992e.ad(r2, r0)
            r0 = 2130969520(0x7f0403b0, float:1.7547724E38)
            int r0 = defpackage.AbstractC12992e.yandex(r2, r0)
            if (r0 != 0) goto L12
            int r0 = defpackage.AbstractC12992e.purchase(r2)
        L12:
            r1.<init>(r2, r0)
            eؑؓۖ r2 = defpackage.C0056e.metrica
            r1.f13687e = r2
            eٖ٘ٞ r2 = new eٖ٘ٞ
            r0 = 5
            r2.<init>(r0, r1)
            r1.f13688e = r2
            android.content.Context r2 = r1.getContext()
            eَؘؑ r2 = defpackage.C10085e.license(r2)
            r1.f13689e = r2
            eؘُؑ r2 = new eؘُؑ
            r0 = 1
            r2.<init>(r1, r0)
            r1.f13682e = r2
            eْٕ r2 = new eْٕ
            r0 = 4
            r2.<init>(r0, r1)
            r1.f13676e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC6627e.<init>(android.content.Context):void");
    }

    public final void adcel(List list) {
        this.f13686e = SystemClock.uptimeMillis();
        this.f13675e.clear();
        this.f13675e.addAll(list);
        this.f13690e.notifyDataSetChanged();
        HandlerC17797e handlerC17797e = this.f13688e;
        handlerC17797e.removeMessages(3);
        handlerC17797e.removeMessages(2);
        if (!list.isEmpty()) {
            smaato(1);
        } else {
            smaato(0);
            handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(2), 5000L);
        }
    }

    public final void advert(C0056e c0056e) {
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f13687e.equals(c0056e)) {
            return;
        }
        this.f13687e = c0056e;
        if (this.f13684e) {
            C10085e c10085e = this.f13689e;
            C0132e c0132e = this.f13682e;
            c10085e.yandex(c0132e);
            c10085e.ad(c0056e, c0132e, 1);
        }
        mopub();
    }

    @Override // defpackage.DialogC11829e, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.f13676e);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void mopub() {
        if (this.f13684e) {
            this.f13689e.getClass();
            C10085e.vip();
            ArrayList arrayList = new ArrayList(C10085e.metrica().startapp);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                C6541e c6541e = (C6541e) arrayList.get(i);
                if (c6541e.license() || !c6541e.billing || !c6541e.yandex(this.f13687e)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, C11021e.f21839e);
            if (SystemClock.uptimeMillis() - this.f13686e >= 300) {
                adcel(arrayList);
                return;
            }
            HandlerC17797e handlerC17797e = this.f13688e;
            handlerC17797e.removeMessages(1);
            handlerC17797e.sendMessageAtTime(handlerC17797e.obtainMessage(1, arrayList), this.f13686e + 300);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13684e = true;
        this.f13689e.ad(this.f13687e, this.f13682e, 1);
        mopub();
        HandlerC17797e handlerC17797e = this.f13688e;
        handlerC17797e.removeMessages(2);
        handlerC17797e.removeMessages(3);
        handlerC17797e.removeMessages(1);
        handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(2), 5000L);
    }

    @Override // defpackage.DialogC11829e, defpackage.DialogC6137e, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.f13675e = new ArrayList();
        this.f13690e = new C15971e(getContext(), this.f13675e);
        this.f13683e = (TextView) findViewById(R.id.mr_chooser_title);
        this.f13674e = (TextView) findViewById(R.id.mr_chooser_searching);
        this.f13673e = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.f13677e = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.f13680e = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.f13681e = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.f13679e = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.f13678e = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z2 = false;
        if (AbstractC18209e.billing == null) {
            if (!AbstractC18209e.license(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (AbstractC18209e.mopub == null) {
                    AbstractC18209e.mopub = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!AbstractC18209e.mopub.booleanValue() && !AbstractC18209e.vip(context) && !AbstractC18209e.appmetrica(context)) {
                    z = true;
                    AbstractC18209e.billing = Boolean.valueOf(z);
                }
            }
            z = false;
            AbstractC18209e.billing = Boolean.valueOf(z);
        }
        if (!AbstractC18209e.billing.booleanValue()) {
            if (AbstractC18209e.startapp == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                AbstractC18209e.startapp = Boolean.valueOf(z2);
            }
            if (!AbstractC18209e.startapp.booleanValue()) {
                if (AbstractC18209e.license(context) || AbstractC18209e.metrica(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (AbstractC18209e.appmetrica(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (AbstractC18209e.mopub == null) {
                        AbstractC18209e.mopub = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = AbstractC18209e.mopub.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : AbstractC18209e.vip(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.f13677e.setText(string);
                this.f13680e.setMovementMethod(LinkMovementMethod.getInstance());
                this.f13679e.setOnClickListener(new ViewOnClickListenerC0123e(6, this));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.f13685e = listView;
                listView.setAdapter((ListAdapter) this.f13690e);
                this.f13685e.setOnItemClickListener(this.f13690e);
                this.f13685e.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(AbstractC12900e.vip(getContext()), -2);
                getContext().registerReceiver(this.f13676e, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.f13677e.setText(string);
        this.f13680e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f13679e.setOnClickListener(new ViewOnClickListenerC0123e(6, this));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.f13685e = listView2;
        listView2.setAdapter((ListAdapter) this.f13690e);
        this.f13685e.setOnItemClickListener(this.f13690e);
        this.f13685e.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(AbstractC12900e.vip(getContext()), -2);
        getContext().registerReceiver(this.f13676e, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f13684e = false;
        this.f13689e.yandex(this.f13682e);
        HandlerC17797e handlerC17797e = this.f13688e;
        handlerC17797e.removeMessages(1);
        handlerC17797e.removeMessages(2);
        handlerC17797e.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.DialogC11829e, android.app.Dialog
    public final void setTitle(int i) {
        this.f13683e.setText(i);
    }

    @Override // defpackage.DialogC11829e, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f13683e.setText(charSequence);
    }

    public final void smaato(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.f13685e.setVisibility(8);
            this.f13674e.setVisibility(0);
            this.f13678e.setVisibility(0);
            this.f13681e.setVisibility(8);
            this.f13679e.setVisibility(8);
            this.f13680e.setVisibility(8);
            this.f13673e.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.f13685e.setVisibility(0);
            this.f13674e.setVisibility(8);
            this.f13678e.setVisibility(8);
            this.f13681e.setVisibility(8);
            this.f13679e.setVisibility(8);
            this.f13680e.setVisibility(8);
            this.f13673e.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.f13685e.setVisibility(8);
            this.f13674e.setVisibility(8);
            this.f13678e.setVisibility(0);
            this.f13681e.setVisibility(8);
            this.f13679e.setVisibility(8);
            this.f13680e.setVisibility(4);
            this.f13673e.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.f13685e.setVisibility(8);
        this.f13674e.setVisibility(8);
        this.f13678e.setVisibility(8);
        this.f13681e.setVisibility(0);
        this.f13679e.setVisibility(0);
        this.f13680e.setVisibility(0);
        this.f13673e.setVisibility(0);
    }
}
