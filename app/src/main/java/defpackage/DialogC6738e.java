package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC6738e extends DialogC11829e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public RecyclerView f13924e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C2056e f13925e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C0056e f13926e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f13927e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final HandlerC17797e f13928e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public long f13929e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C6541e f13930e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final long f13931e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0132e f13932e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public ArrayList f13933e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Context f13934e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C10085e f13935e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC6738e(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.AbstractC12992e.ad(r3, r0)
            r0 = 2130969520(0x7f0403b0, float:1.7547724E38)
            int r0 = defpackage.AbstractC12992e.yandex(r3, r0)
            if (r0 != 0) goto L12
            int r0 = defpackage.AbstractC12992e.purchase(r3)
        L12:
            r2.<init>(r3, r0)
            eؑؓۖ r3 = defpackage.C0056e.metrica
            r2.f13926e = r3
            eٖ٘ٞ r3 = new eٖ٘ٞ
            r0 = 6
            r3.<init>(r0, r2)
            r2.f13928e = r3
            android.content.Context r3 = r2.getContext()
            eَؘؑ r0 = defpackage.C10085e.license(r3)
            r2.f13935e = r0
            eؘُؑ r0 = new eؘُؑ
            r1 = 3
            r0.<init>(r2, r1)
            r2.f13932e = r0
            r2.f13934e = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131427386(0x7f0b003a, float:1.8476387E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.f13931e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC6738e.<init>(android.content.Context):void");
    }

    public final void adcel() {
        if (this.f13930e == null && this.f13927e) {
            this.f13935e.getClass();
            C10085e.vip();
            ArrayList arrayList = new ArrayList(C10085e.metrica().startapp);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                C6541e c6541e = (C6541e) arrayList.get(i);
                if (c6541e.license() || !c6541e.billing || !c6541e.yandex(this.f13926e)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, C11021e.f21834e);
            long uptimeMillis = SystemClock.uptimeMillis() - this.f13929e;
            long j = this.f13931e;
            if (uptimeMillis < j) {
                HandlerC17797e handlerC17797e = this.f13928e;
                handlerC17797e.removeMessages(1);
                handlerC17797e.sendMessageAtTime(handlerC17797e.obtainMessage(1, arrayList), this.f13929e + j);
            } else {
                this.f13929e = SystemClock.uptimeMillis();
                this.f13933e.clear();
                this.f13933e.addAll(arrayList);
                this.f13925e.ads();
            }
        }
    }

    public final void mopub(C0056e c0056e) {
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f13926e.equals(c0056e)) {
            return;
        }
        this.f13926e = c0056e;
        if (this.f13927e) {
            C10085e c10085e = this.f13935e;
            C0132e c0132e = this.f13932e;
            c10085e.yandex(c0132e);
            c10085e.ad(c0056e, c0132e, 1);
        }
        adcel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13927e = true;
        this.f13935e.ad(this.f13926e, this.f13932e, 1);
        adcel();
    }

    @Override // defpackage.DialogC11829e, defpackage.DialogC6137e, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.f13934e;
        decorView.setBackgroundColor(context.getColor(AbstractC12992e.startapp(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.f13933e = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new ViewOnClickListenerC8021e(3, this));
        this.f13925e = new C2056e(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.f13924e = recyclerView;
        recyclerView.setAdapter(this.f13925e);
        this.f13924e.setLayoutManager(new LinearLayoutManager(1));
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC12900e.vip(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13927e = false;
        this.f13935e.yandex(this.f13932e);
        this.f13928e.removeMessages(1);
    }
}
