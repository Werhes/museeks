package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3024e {
    public CharSequence Signature;
    public final Context ad;
    public CharSequence adcel;
    public Message admob;
    public final int ads;
    public Button advert;
    public Message amazon;
    public final int applovin;
    public String appmetrica;
    public LinearLayout billing;
    public final boolean crashlytics;
    public final HandlerC15600e firebase;
    public ListAdapter inmobi;
    public View isVip;
    public CharSequence license;
    public Button loadAd;
    public final Window metrica;
    public Message mopub;
    public final int premium;
    public ImageView pro;
    public AlertController$RecycleListView purchase;
    public Drawable remoteconfig;
    public TextView signatures;
    public CharSequence smaato;
    public Button startapp;
    public final int subs;
    public NestedScrollView subscription;
    public TextView tapsense;
    public final DialogInterfaceC15370e vip;
    public boolean yandex = false;
    public int isPro = -1;

    /* renamed from: class, reason: not valid java name */
    public final ViewOnClickListenerC8021e f7087class = new ViewOnClickListenerC8021e(1, this);

    public C3024e(Context context, DialogInterfaceC15370e dialogInterfaceC15370e, Window window) {
        this.ad = context;
        this.vip = dialogInterfaceC15370e;
        this.metrica = window;
        HandlerC15600e handlerC15600e = new HandlerC15600e();
        handlerC15600e.vip = new WeakReference(dialogInterfaceC15370e);
        this.firebase = handlerC15600e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC6062e.appmetrica, R.attr.alertDialogStyle, 0);
        this.applovin = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.ads = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.premium = obtainStyledAttributes.getResourceId(7, 0);
        this.subs = obtainStyledAttributes.getResourceId(3, 0);
        this.crashlytics = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC15370e.billing().startapp(1);
    }

    public static boolean ad(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (ad(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup vip(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void metrica(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.firebase.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.Signature = charSequence;
            this.admob = obtainMessage;
        } else if (i == -2) {
            this.smaato = charSequence;
            this.amazon = obtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.adcel = charSequence;
            this.mopub = obtainMessage;
        }
    }
}
