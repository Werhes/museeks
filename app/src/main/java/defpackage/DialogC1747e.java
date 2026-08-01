package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.vip;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1747e extends DialogC11829e {

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public static final /* synthetic */ int f4748e = 0;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public MediaDescriptionCompat f4749e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final ArrayList f4750e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f4751e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C6541e f4752e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C3654e f4753e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final ArrayList f4754e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f4755e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public AsyncTaskC5951e f4756e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public View f4757e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public Button f4758e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public Uri f4759e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f4760e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final Context f4761e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public TextView f4762e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f4763e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public Bitmap f4764e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public ImageButton f4765e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0132e f4766e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public boolean f4767e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public boolean f4768e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final ArrayList f4769e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public HashMap f4770e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C14356e f4771e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public ImageView f4772e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public TextView f4773e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f4774e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final HandlerC17797e f4775e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public ImageView f4776e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public Bitmap f4777e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public HashMap f4778e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C0056e f4779e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public int f4780e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public C6541e f4781e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public String f4782e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public boolean f4783e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C13632e f4784e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public C11883e f4785e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C10085e f4786e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public RecyclerView f4787e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final boolean f4788e;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC1747e(android.content.Context r2) {
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
            r1.f4779e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4769e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4751e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4750e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4754e = r2
            eٖ٘ٞ r2 = new eٖ٘ٞ
            r0 = 7
            r2.<init>(r0, r1)
            r1.f4775e = r2
            android.content.Context r2 = r1.getContext()
            r1.f4761e = r2
            eَؘؑ r2 = defpackage.C10085e.license(r2)
            r1.f4786e = r2
            boolean r2 = defpackage.C10085e.billing()
            r1.f4788e = r2
            eؘُؑ r2 = new eؘُؑ
            r0 = 4
            r2.<init>(r1, r0)
            r1.f4766e = r2
            eؙِٞ r2 = defpackage.C10085e.purchase()
            r1.f4752e = r2
            eْۦؔ r2 = new eْۦؔ
            r0 = 1
            r2.<init>(r1, r0)
            r1.f4784e = r2
            android.support.v4.media.session.MediaSessionCompat$Token r2 = defpackage.C10085e.appmetrica()
            r1.advert(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC1747e.<init>(android.content.Context):void");
    }

    public final void Signature() {
        ArrayList arrayList = this.f4769e;
        arrayList.clear();
        ArrayList arrayList2 = this.f4751e;
        arrayList2.clear();
        ArrayList arrayList3 = this.f4750e;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.f4752e.tapsense));
        C14756e ad = this.f4752e.ad();
        if (ad != null) {
            C9701e c9701e = this.f4752e.ad;
            c9701e.getClass();
            C10085e.vip();
            for (C6541e c6541e : DesugarCollections.unmodifiableList(c9701e.vip)) {
                if (ad.loadAd(c6541e)) {
                    arrayList2.add(c6541e);
                }
                C7712e c7712e = (C7712e) ad.inmobi.get(c6541e.metrica);
                if (c7712e != null && c7712e.appmetrica) {
                    arrayList3.add(c6541e);
                }
            }
        }
        adcel(arrayList2);
        adcel(arrayList3);
        C11021e c11021e = C11021e.f21842e;
        Collections.sort(arrayList, c11021e);
        Collections.sort(arrayList2, c11021e);
        Collections.sort(arrayList3, c11021e);
        this.f4753e.crashlytics();
    }

    public final void adcel(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C6541e c6541e = (C6541e) list.get(size);
            if (c6541e.license() || !c6541e.billing || !c6541e.yandex(this.f4779e) || this.f4752e == c6541e) {
                list.remove(size);
            }
        }
    }

    public final void admob() {
        if (this.f4760e) {
            if (SystemClock.uptimeMillis() - this.f4755e < 300) {
                HandlerC17797e handlerC17797e = this.f4775e;
                handlerC17797e.removeMessages(1);
                handlerC17797e.sendEmptyMessageAtTime(1, this.f4755e + 300);
                return;
            }
            if ((this.f4781e != null || this.f4767e) ? true : !this.f4763e) {
                this.f4768e = true;
                return;
            }
            this.f4768e = false;
            if (!this.f4752e.billing() || this.f4752e.license()) {
                dismiss();
            }
            this.f4755e = SystemClock.uptimeMillis();
            this.f4753e.subs();
        }
    }

    public final void advert(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        C11883e c11883e = this.f4785e;
        C13632e c13632e = this.f4784e;
        if (c11883e != null) {
            c11883e.pro(c13632e);
            this.f4785e = null;
        }
        if (mediaSessionCompat$Token != null && this.f4760e) {
            C11883e c11883e2 = new C11883e(this.f4761e, mediaSessionCompat$Token);
            this.f4785e = c11883e2;
            c11883e2.admob(c13632e);
            MediaMetadata metadata = ((vip) this.f4785e.f23815e).ad.getMetadata();
            if (metadata != null) {
                C2271e c2271e = MediaMetadataCompat.f20e;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.f24e = metadata;
            } else {
                mediaMetadataCompat = null;
            }
            this.f4749e = mediaMetadataCompat != null ? mediaMetadataCompat.ad() : null;
            mopub();
            loadAd();
        }
    }

    public final void amazon() {
        Context context = this.f4761e;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC12900e.vip(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.f4764e = null;
        this.f4759e = null;
        mopub();
        loadAd();
        admob();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadAd() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DialogC1747e.loadAd():void");
    }

    public final void mopub() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4749e;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f10e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f18e : null;
        AsyncTaskC5951e asyncTaskC5951e = this.f4756e;
        Bitmap bitmap2 = asyncTaskC5951e == null ? this.f4764e : asyncTaskC5951e.ad;
        Uri uri2 = asyncTaskC5951e == null ? this.f4759e : asyncTaskC5951e.vip;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            AsyncTaskC5951e asyncTaskC5951e2 = this.f4756e;
            if (asyncTaskC5951e2 != null) {
                asyncTaskC5951e2.cancel(true);
            }
            AsyncTaskC5951e asyncTaskC5951e3 = new AsyncTaskC5951e(this);
            this.f4756e = asyncTaskC5951e3;
            asyncTaskC5951e3.execute(new Void[0]);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4760e = true;
        this.f4786e.ad(this.f4779e, this.f4766e, 1);
        Signature();
        advert(C10085e.appmetrica());
    }

    @Override // defpackage.DialogC11829e, defpackage.DialogC6137e, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.f4761e;
        decorView.setBackgroundColor(context.getColor(AbstractC12992e.startapp(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.f4765e = imageButton;
        imageButton.setColorFilter(-1);
        this.f4765e.setOnClickListener(new ViewOnClickListenerC15218e(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.f4758e = button;
        button.setTextColor(-1);
        this.f4758e.setOnClickListener(new ViewOnClickListenerC15218e(this, 1));
        this.f4753e = new C3654e(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.f4787e = recyclerView;
        recyclerView.setAdapter(this.f4753e);
        this.f4787e.setLayoutManager(new LinearLayoutManager(1));
        this.f4771e = new C14356e(this);
        this.f4778e = new HashMap();
        this.f4770e = new HashMap();
        this.f4772e = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.f4757e = findViewById(R.id.mr_cast_meta_black_scrim);
        this.f4776e = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.f4773e = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.f4762e = textView2;
        textView2.setTextColor(-1);
        this.f4782e = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.f4763e = true;
        amazon();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4760e = false;
        this.f4786e.yandex(this.f4766e);
        this.f4775e.removeCallbacksAndMessages(null);
        advert(null);
    }

    public final void smaato(C0056e c0056e) {
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4779e.equals(c0056e)) {
            return;
        }
        this.f4779e = c0056e;
        if (this.f4760e) {
            C10085e c10085e = this.f4786e;
            C0132e c0132e = this.f4766e;
            c10085e.yandex(c0132e);
            c10085e.ad(c0056e, c0132e, 1);
            Signature();
        }
    }

    public final void subscription() {
        if (this.f4768e) {
            admob();
        }
        if (this.f4774e) {
            loadAd();
        }
    }
}
