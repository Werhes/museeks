package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC6137e extends Dialog implements InterfaceC16400e, InterfaceC15119e, InterfaceC12760e, InterfaceC10998e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5363e f12905e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5891e f12906e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C5363e f12907e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C4891e f12908e;

    public DialogC6137e(Context context, int i) {
        super(context, i);
        this.f12906e = new C5891e(new C3560e(this, new C13465e(26, this)));
        final int i2 = 0;
        this.f12905e = new C5363e(new Function0(this) { // from class: eٌ٘ۙ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ DialogC6137e f17676e;

            {
                this.f17676e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eُؓۦ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        this.f17676e.metrica().advert(obj);
                        return obj;
                    default:
                        return new C6194e(new RunnableC17584e(19, this.f17676e));
                }
            }
        });
        final int i3 = 1;
        this.f12907e = new C5363e(new Function0(this) { // from class: eٌ٘ۙ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ DialogC6137e f17676e;

            {
                this.f17676e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eُؓۦ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ?? obj = new Object();
                        this.f17676e.metrica().advert(obj);
                        return obj;
                    default:
                        return new C6194e(new RunnableC17584e(19, this.f17676e));
                }
            }
        });
    }

    public static void license(DialogC6137e dialogC6137e) {
        super.onBackPressed();
    }

    @Override // defpackage.InterfaceC15119e
    public final C6194e ad() {
        return (C6194e) this.f12907e.getValue();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        super.addContentView(view, layoutParams);
    }

    public final C4891e appmetrica() {
        C4891e c4891e = this.f12908e;
        if (c4891e != null) {
            return c4891e;
        }
        C4891e c4891e2 = new C4891e(this, true);
        this.f12908e = c4891e2;
        return c4891e2;
    }

    @Override // defpackage.InterfaceC12760e
    public final C11106e metrica() {
        return ad().vip().metrica;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C7891e) this.f12905e.getValue()).ad();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ad().metrica(getOnBackInvokedDispatcher());
        }
        this.f12906e.m2001try(bundle);
        appmetrica().appmetrica(EnumC14621e.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.f12906e.m1999protected(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        appmetrica().appmetrica(EnumC14621e.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        appmetrica().appmetrica(EnumC14621e.ON_DESTROY);
        this.f12908e = null;
        super.onStop();
    }

    public final void purchase() {
        AbstractC0436e.startapp(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        AbstractC15428e.appmetrica(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        purchase();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        purchase();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        super.setContentView(view, layoutParams);
    }

    @Override // defpackage.InterfaceC16400e
    public final AbstractC0003e vip() {
        return appmetrica();
    }

    @Override // defpackage.InterfaceC10998e
    public final C3168e yandex() {
        return (C3168e) this.f12906e.f12439e;
    }
}
