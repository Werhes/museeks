package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۦؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11389e {
    public int Signature;
    public final Context ad;
    public int adcel;
    public String admob;
    public final ArrayList ads;
    public boolean advert;
    public CharSequence amazon;
    public final Notification applovin;
    public CharSequence appmetrica;
    public PendingIntent billing;
    public final boolean isPro;
    public String isVip;
    public int loadAd;
    public Bundle pro;
    public CharSequence purchase;
    public String remoteconfig;
    public Cpackage smaato;
    public int startapp;
    public IconCompat yandex;
    public final ArrayList vip = new ArrayList();
    public final ArrayList metrica = new ArrayList();
    public final ArrayList license = new ArrayList();
    public boolean mopub = true;
    public boolean subscription = false;
    public int signatures = 0;
    public int tapsense = 0;
    public int inmobi = 0;

    public C11389e(Context context, String str) {
        Notification notification = new Notification();
        this.applovin = notification;
        this.ad = context;
        this.isVip = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.adcel = 0;
        this.ads = new ArrayList();
        this.isPro = true;
    }

    public static CharSequence metrica(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void ad(int i, PendingIntent pendingIntent, String str) {
        this.vip.add(new C9170e(i != 0 ? IconCompat.license(null, BuildConfig.FLAVOR, i) : null, str, pendingIntent));
    }

    public final void appmetrica(int i, boolean z) {
        Notification notification = this.applovin;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void billing(Cpackage cpackage) {
        if (this.smaato != cpackage) {
            this.smaato = cpackage;
            if (((C11389e) cpackage.f36443e) != this) {
                cpackage.f36443e = this;
                billing(cpackage);
            }
        }
    }

    public final void license(CharSequence charSequence) {
        this.purchase = metrica(charSequence);
    }

    public final void purchase(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.ad.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.mopub;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.vip = bitmap;
            iconCompat = iconCompat2;
        }
        this.yandex = iconCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.core.graphics.drawable.IconCompat] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [eِؒۜ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [package] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context, android.content.res.Resources] */
    public final Notification vip() {
        Notification build;
        Bundle bundle;
        String mo1406e;
        int i;
        Bundle[] bundleArr;
        int i2;
        ArrayList arrayList;
        Icon icon;
        ?? r16;
        int i3;
        ?? obj = new Object();
        obj.f23071e = new Bundle();
        obj.f23069e = this;
        Context context = this.ad;
        obj.f23072e = context;
        if (Build.VERSION.SDK_INT >= 26) {
            obj.f23070e = AbstractC11815e.mopub(context, this.isVip);
        } else {
            obj.f23070e = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) obj.f23070e;
        Notification notification = this.applovin;
        ?? r7 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.appmetrica).setContentText(this.purchase).setContentInfo(null).setContentIntent(this.billing).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.startapp).setProgress(this.loadAd, this.Signature, false);
        Notification.Builder builder2 = (Notification.Builder) obj.f23070e;
        IconCompat iconCompat = this.yandex;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.adcel(context));
        ((Notification.Builder) obj.f23070e).setSubText(this.amazon).setUsesChronometer(this.advert).setPriority(this.adcel);
        Iterator it = this.vip.iterator();
        while (it.hasNext()) {
            C9170e c9170e = (C9170e) it.next();
            if (c9170e.vip == null && (i3 = c9170e.purchase) != 0) {
                c9170e.vip = IconCompat.license(r7, BuildConfig.FLAVOR, i3);
            }
            ?? r12 = c9170e.vip;
            boolean z = c9170e.license;
            Bundle bundle2 = c9170e.ad;
            if (r12 != 0) {
                icon = r12.adcel(r7);
                r16 = r7;
            } else {
                icon = r7;
                r16 = icon;
            }
            Notification.Action.Builder builder3 = new Notification.Action.Builder(icon, c9170e.billing, c9170e.yandex);
            AbstractC3496e[] abstractC3496eArr = c9170e.metrica;
            if (abstractC3496eArr != null) {
                int length = abstractC3496eArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (abstractC3496eArr.length > 0) {
                    AbstractC3496e abstractC3496e = abstractC3496eArr[0];
                    throw r16;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    builder3.addRemoteInput(remoteInputArr[i4]);
                }
            }
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                AbstractC12026e.signatures(builder3, z);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                AbstractC17305e.m4291package(builder3);
            }
            if (i5 >= 29) {
                AbstractC14204e.m3782throw(builder3);
            }
            if (i5 >= 31) {
                AbstractC16048e.crashlytics(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c9170e.appmetrica);
            builder3.addExtras(bundle3);
            ((Notification.Builder) obj.f23070e).addAction(builder3.build());
            r7 = r16;
        }
        String str = r7;
        Bundle bundle4 = this.pro;
        if (bundle4 != null) {
            ((Bundle) obj.f23071e).putAll(bundle4);
        }
        ((Notification.Builder) obj.f23070e).setShowWhen(this.mopub);
        ((Notification.Builder) obj.f23070e).setLocalOnly(this.subscription);
        ((Notification.Builder) obj.f23070e).setGroup(this.admob);
        ((Notification.Builder) obj.f23070e).setSortKey(str);
        ((Notification.Builder) obj.f23070e).setGroupSummary(false);
        ((Notification.Builder) obj.f23070e).setCategory(this.remoteconfig);
        ((Notification.Builder) obj.f23070e).setColor(this.signatures);
        ((Notification.Builder) obj.f23070e).setVisibility(this.tapsense);
        ((Notification.Builder) obj.f23070e).setPublicVersion(null);
        ((Notification.Builder) obj.f23070e).setSound(notification.sound, notification.audioAttributes);
        int i6 = Build.VERSION.SDK_INT;
        ArrayList arrayList2 = this.ads;
        ArrayList arrayList3 = this.metrica;
        if (i6 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C2730e c2730e = (C2730e) it2.next();
                    CharSequence charSequence = c2730e.ad;
                    String str2 = c2730e.metrica;
                    if (str2 == null) {
                        str2 = charSequence != null ? "name:" + ((Object) charSequence) : BuildConfig.FLAVOR;
                    }
                    arrayList.add(str2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C17548e c17548e = new C17548e(arrayList2.size() + arrayList.size());
                    c17548e.addAll(arrayList);
                    c17548e.addAll(arrayList2);
                    arrayList2 = new ArrayList(c17548e);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) obj.f23070e).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.license;
        if (arrayList4.size() > 0) {
            if (this.pro == null) {
                this.pro = new Bundle();
            }
            Bundle bundle5 = this.pro.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList4.size()) {
                String num = Integer.toString(i7);
                C9170e c9170e2 = (C9170e) arrayList4.get(i7);
                Bundle bundle8 = new Bundle();
                if (c9170e2.vip == null && (i2 = c9170e2.purchase) != 0) {
                    c9170e2.vip = IconCompat.license(null, BuildConfig.FLAVOR, i2);
                }
                IconCompat iconCompat2 = c9170e2.vip;
                Bundle bundle9 = c9170e2.ad;
                ArrayList arrayList5 = arrayList4;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.appmetrica() : 0);
                bundle8.putCharSequence("title", c9170e2.billing);
                bundle8.putParcelable("actionIntent", c9170e2.yandex);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c9170e2.license);
                bundle8.putBundle("extras", bundle10);
                AbstractC3496e[] abstractC3496eArr2 = c9170e2.metrica;
                if (abstractC3496eArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[abstractC3496eArr2.length];
                    if (abstractC3496eArr2.length > 0) {
                        AbstractC3496e abstractC3496e2 = abstractC3496eArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", c9170e2.appmetrica);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i7++;
                arrayList4 = arrayList5;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.pro == null) {
                this.pro = new Bundle();
            }
            this.pro.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) obj.f23071e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            ((Notification.Builder) obj.f23070e).setExtras(this.pro);
            AbstractC12026e.isVip((Notification.Builder) obj.f23070e);
        }
        if (i8 >= 26) {
            AbstractC11815e.m3263protected((Notification.Builder) obj.f23070e);
            AbstractC11815e.m3262private((Notification.Builder) obj.f23070e);
            AbstractC11815e.m3261package((Notification.Builder) obj.f23070e);
            AbstractC11815e.m3257instanceof((Notification.Builder) obj.f23070e);
            AbstractC11815e.m3245case((Notification.Builder) obj.f23070e);
            if (!TextUtils.isEmpty(this.isVip)) {
                ((Notification.Builder) obj.f23070e).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C2730e c2730e2 = (C2730e) it4.next();
                Notification.Builder builder4 = (Notification.Builder) obj.f23070e;
                c2730e2.getClass();
                AbstractC17305e.appmetrica(builder4, AbstractC17305e.m4294static(c2730e2));
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            AbstractC14204e.m3781this((Notification.Builder) obj.f23070e, this.isPro);
            AbstractC14204e.m3772extends((Notification.Builder) obj.f23070e);
        }
        if (i9 >= 31 && (i = this.inmobi) != 0) {
            AbstractC16048e.firebase((Notification.Builder) obj.f23070e, i);
        }
        if (i9 >= 36) {
            AbstractC18416e.purchase((Notification.Builder) obj.f23070e);
        }
        C11389e c11389e = (C11389e) obj.f23069e;
        ?? r3 = c11389e.smaato;
        if (r3 != 0) {
            r3.mo1407e(obj);
        }
        Notification.Builder builder5 = (Notification.Builder) obj.f23070e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            build = builder5.build();
        } else if (i10 >= 24) {
            build = builder5.build();
        } else {
            builder5.setExtras((Bundle) obj.f23071e);
            build = builder5.build();
        }
        if (r3 != 0) {
            c11389e.smaato.getClass();
        }
        if (r3 != 0 && (bundle = build.extras) != null && (mo1406e = r3.mo1406e()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo1406e);
        }
        return build;
    }
}
