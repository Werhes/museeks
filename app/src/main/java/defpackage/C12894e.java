package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media.session.MediaButtonReceiver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.zip.Adler32;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12894e implements InterfaceC17357e, InterfaceC17490e, InterfaceC14020e, InterfaceC15169e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static int f25749e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f25750e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f25751e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f25752e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25753e;

    public C12894e(int i) {
        this.f25753e = i;
        switch (i) {
            case 14:
                C15420e c15420e = AbstractC6731e.ad;
                C12940e c12940e = AbstractC1497e.ad.f25795e;
                C11380e ad = AbstractC5097e.ad();
                c12940e.getClass();
                this.f25751e = AbstractC9743e.ad(AbstractC5797e.vip(c12940e, ad));
                this.f25752e = AbstractC14533e.startapp(C0595e.ad);
                return;
            case 15:
                this.f25751e = new int[16];
                this.f25750e = new int[16];
                this.f25752e = new int[16];
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long[] jArr = AbstractC12981e.ad;
                this.f25751e = new C0583e();
                return;
            default:
                C8705e c8705e = new C8705e(6, false);
                c8705e.f17570e = Float.NaN;
                this.f25751e = c8705e;
                this.f25750e = new Object();
                return;
        }
    }

    public /* synthetic */ C12894e(int i, Object obj, Object obj2, Object obj3) {
        this.f25753e = i;
        this.f25751e = obj;
        this.f25750e = obj2;
        this.f25752e = obj3;
    }

    public /* synthetic */ C12894e(int i, boolean z) {
        this.f25753e = i;
    }

    public C12894e(Context context, ComponentName componentName, PendingIntent pendingIntent) {
        this.f25753e = 0;
        this.f25752e = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty("CastMediaSession")) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i = MediaButtonReceiver.ad;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f25751e = new C15944e(context);
        } else if (i2 >= 28) {
            this.f25751e = new C15944e(context);
        } else {
            this.f25751e = new C15944e(context);
        }
        firebase(new AbstractC9882e(1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        ((C15944e) this.f25751e).ad.setMediaButtonReceiver(pendingIntent);
        this.f25750e = new C11883e(context, ((C15944e) this.f25751e).metrica);
        if (f25749e == 0) {
            f25749e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public C12894e(View view) {
        this.f25753e = 20;
        this.f25751e = view;
        this.f25750e = AbstractC18039e.appmetrica(3, new C17073e(7, this));
        this.f25752e = new C2691e(view);
    }

    public C12894e(CastDevice castDevice, C18017e c18017e) {
        this.f25753e = 9;
        AbstractC9528e.adcel(castDevice, "CastDevice parameter cannot be null");
        this.f25751e = castDevice;
        this.f25750e = c18017e;
    }

    public C12894e(C1343e c1343e) {
        this.f25753e = 25;
        this.f25750e = c1343e;
        this.f25751e = new C16911e(27);
    }

    public C12894e(C12053e c12053e, ListenableFuture listenableFuture) {
        this.f25753e = 8;
        this.f25751e = c12053e.mopub;
        this.f25750e = c12053e.amazon;
        this.f25752e = listenableFuture;
    }

    public C12894e(C12621e c12621e) {
        this.f25753e = 22;
        this.f25752e = c12621e;
        this.f25751e = new C16691e(1, this);
    }

    public C12894e(InterfaceC17357e interfaceC17357e) {
        this.f25753e = 7;
        this.f25751e = interfaceC17357e;
        this.f25750e = new C13197e(interfaceC17357e.adcel());
        this.f25752e = new C9674e(interfaceC17357e.subs());
    }

    public C12894e(C18414e c18414e) {
        this.f25753e = 26;
        this.f25751e = c18414e;
    }

    public C12894e(String str) {
        this.f25753e = 24;
        Object obj = new Object();
        this.f25750e = obj;
        this.f25752e = obj;
        this.f25751e = str;
    }

    public C12894e(String str, InterfaceC12424e interfaceC12424e, C13410e c13410e) {
        this.f25753e = 23;
        this.f25751e = str;
        this.f25750e = interfaceC12424e;
        this.f25752e = new C5363e(new C1708e(c13410e, this, 7));
    }

    public C12894e(FileChannel fileChannel) {
        this.f25753e = 17;
        byte[] bArr = new byte[8192];
        this.f25751e = bArr;
        this.f25750e = ByteBuffer.wrap(bArr);
        this.f25752e = fileChannel;
    }

    public C12894e(ExecutorService executorService, ExecutorService executorService2) {
        this.f25753e = 1;
        this.f25751e = new ExecutorC4614e(executorService);
        this.f25750e = new ExecutorC4614e(executorService);
        AbstractC1749e.appmetrica(null);
        this.f25752e = new ExecutorC4614e(executorService2);
    }

    public C12894e(byte[] bArr, ListenableFuture listenableFuture) {
        this.f25753e = 8;
        this.f25751e = bArr;
        this.f25750e = null;
        this.f25752e = listenableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eٌۡۙ, java.lang.Object] */
    public C12894e(InterfaceC9018e[] interfaceC9018eArr) {
        this.f25753e = 12;
        C15359e c15359e = new C15359e();
        ?? obj = new Object();
        obj.metrica = 1.0f;
        obj.license = 1.0f;
        C10348e c10348e = C10348e.appmetrica;
        obj.appmetrica = c10348e;
        obj.purchase = c10348e;
        obj.billing = c10348e;
        obj.yandex = c10348e;
        ByteBuffer byteBuffer = InterfaceC9018e.ad;
        obj.mopub = byteBuffer;
        obj.advert = byteBuffer;
        obj.vip = -1;
        InterfaceC9018e[] interfaceC9018eArr2 = new InterfaceC9018e[interfaceC9018eArr.length + 2];
        this.f25751e = interfaceC9018eArr2;
        System.arraycopy(interfaceC9018eArr, 0, interfaceC9018eArr2, 0, interfaceC9018eArr.length);
        this.f25750e = c15359e;
        this.f25752e = obj;
        interfaceC9018eArr2[interfaceC9018eArr.length] = c15359e;
        interfaceC9018eArr2[interfaceC9018eArr.length + 1] = obj;
    }

    public static final void amazon() {
        if (AbstractC5304e.inmobi(Thread.currentThread().getName(), "Firebase Blocking Thread #", false)) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public static Bundle m3412interface(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        subscription(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void smaato() {
        if (AbstractC5304e.inmobi(Thread.currentThread().getName(), "Firebase Background Thread #", false)) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static void subscription(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C12894e.class.getClassLoader());
        }
    }

    @Override // defpackage.InterfaceC17490e
    public void Signature(C6408e c6408e, Context context, Looper looper, Looper looper2, C17381e c17381e) {
        C17790e c17790e = new C17790e(Boolean.TRUE, looper2, looper, c17381e, new C15692e(c6408e, 0));
        this.f25752e = c17790e;
        c17790e.m4427extends(new RunnableC2623e(this, context, 1));
    }

    public void ad(int i, String str) {
        license(str, String.valueOf(i));
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC2537e adcel() {
        return (C13197e) this.f25750e;
    }

    public void admob(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f25751e;
        C12426e c12426e = new C12426e(byteArrayOutputStream, hashMap, (HashMap) this.f25750e, (InterfaceC1848e) this.f25752e);
        if (obj == null) {
            return;
        }
        InterfaceC1848e interfaceC1848e = (InterfaceC1848e) hashMap.get(obj.getClass());
        if (interfaceC1848e != null) {
            interfaceC1848e.ad(obj, c12426e);
        } else {
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    public void ads(long j, long j2, C16151e c16151e) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f25750e;
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            try {
                byteBuffer.limit((int) Math.min(8192L, j2));
                if (((FileChannel) this.f25752e).read(byteBuffer, j) == -1) {
                    throw new EOFException();
                }
                int position = byteBuffer.position();
                c16151e.write((byte[]) this.f25751e, 0, position);
                long j3 = position;
                j += j3;
                j2 -= j3;
            } finally {
                byteBuffer.clear();
            }
        }
    }

    @Override // defpackage.InterfaceC17490e
    public boolean advert() {
        C17790e c17790e = (C17790e) this.f25752e;
        if (c17790e == null) {
            return true;
        }
        return ((Boolean) c17790e.amazon()).booleanValue();
    }

    public boolean applovin() {
        AudioManager audioManager = (AudioManager) this.f25751e;
        audioManager.getClass();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && audioDeviceInfo.getType() == 22) {
                return true;
            }
            if (i >= 28 && audioDeviceInfo.getType() == 23) {
                return true;
            }
            if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return true;
            }
            if (i >= 33 && audioDeviceInfo.getType() == 30) {
                return true;
            }
        }
        return false;
    }

    public C8059e appmetrica() {
        C17974e c17974e;
        C15768e vip;
        C9325e c9325e = (C9325e) this.f25751e;
        if (c9325e == null || (c17974e = (C17974e) this.f25750e) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c9325e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c9325e.ad() && ((Integer) this.f25752e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C9325e) this.f25751e).ad() && ((Integer) this.f25752e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C11594e c11594e = ((C9325e) this.f25751e).license;
        if (c11594e == C11594e.f23291e) {
            vip = AbstractC16176e.ad;
        } else if (c11594e == C11594e.f23293e) {
            vip = AbstractC16176e.ad(((Integer) this.f25752e).intValue());
        } else {
            if (c11594e != C11594e.f23292e) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((C9325e) this.f25751e).license);
            }
            vip = AbstractC16176e.vip(((Integer) this.f25752e).intValue());
        }
        return new C8059e((C9325e) this.f25751e, (C17974e) this.f25750e, vip, (Integer) this.f25752e);
    }

    @Override // defpackage.InterfaceC17490e
    public void billing() {
        C17790e c17790e = (C17790e) this.f25752e;
        c17790e.getClass();
        c17790e.m4427extends(new RunnableC17584e(25, this));
    }

    @Override // defpackage.InterfaceC17357e
    public void cancel() {
        ((InterfaceC17357e) this.f25751e).cancel();
    }

    /* renamed from: class, reason: not valid java name */
    public void m3413class(MediaMetadataCompat mediaMetadataCompat) {
        C15944e c15944e = (C15944e) this.f25751e;
        c15944e.billing = mediaMetadataCompat;
        MediaSession mediaSession = c15944e.ad;
        Bundle bundle = mediaMetadataCompat.f25e;
        if (mediaMetadataCompat.f24e == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) MediaMetadataCompat.f20e.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (intValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataCompat.f24e = builder.build();
        }
        mediaSession.setMetadata(mediaMetadataCompat.f24e);
    }

    public void crashlytics(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f25751e = str;
    }

    public void firebase(AbstractC9882e abstractC9882e, Handler handler) {
        C15944e c15944e = (C15944e) this.f25751e;
        if (abstractC9882e == null) {
            c15944e.appmetrica(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        c15944e.appmetrica(abstractC9882e, handler);
    }

    @Override // defpackage.InterfaceC14020e
    /* renamed from: import */
    public List mo818import(C14677e c14677e) {
        C5363e c5363e = (C5363e) this.f25752e;
        return AbstractC17140e.vip(c14677e, ((C9368e) c5363e.getValue()).ad) ? AbstractC13480e.m3575continue(((C9368e) c5363e.getValue()).vip.keySet()) : C13664e.f27089e;
    }

    public int inmobi() {
        C14870e c14870e = (C14870e) this.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        if (c14870e.ad.isEmpty()) {
            return 0;
        }
        C14870e c14870e2 = (C14870e) this.f25750e;
        if (c14870e2 == null) {
            c14870e2 = null;
        }
        int i = ((C8518e) AbstractC13480e.m3591interface(c14870e2.ad)).mopub;
        C14870e c14870e3 = (C14870e) this.f25750e;
        int i2 = i + (-(c14870e3 != null ? c14870e3 : null).purchase);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    public int isPro() {
        return ((Number) ((C18414e) this.f25751e).invoke()).intValue();
    }

    public int isVip() {
        C14870e c14870e = (C14870e) this.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        if (c14870e.ad.isEmpty()) {
            return 0;
        }
        C14870e c14870e2 = (C14870e) this.f25750e;
        if (c14870e2 == null) {
            c14870e2 = null;
        }
        int i = ((C8518e) AbstractC13480e.m3570break(c14870e2.ad)).mopub;
        C14870e c14870e3 = (C14870e) this.f25750e;
        return Math.abs(((i + (c14870e3 != null ? c14870e3 : null).vip) + (c14870e3 != null ? c14870e3 : null).metrica) - (c14870e3 != null ? c14870e3 : null).billing);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؒ, java.lang.Object] */
    public void license(String str, String str2) {
        ?? obj = new Object();
        ((C0909e) this.f25752e).f3321e = obj;
        this.f25752e = obj;
        obj.f3322e = str2;
        obj.f3323e = str;
    }

    public void loadAd(String str, String str2) {
        C11364e c11364e = new C11364e(str, str2);
        C8419e c8419e = (C8419e) this.f25750e;
        InterfaceC5083e interfaceC5083e = null;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        C8419e purchase = AbstractC5336e.purchase((C14826e) this.f25751e, null, 0, new C6626e(this, c11364e, interfaceC5083e, 5), 3);
        purchase.mo692else(new C10739e(17, this));
        this.f25750e = purchase;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؒ, java.lang.Object] */
    public void metrica(Object obj, String str) {
        ?? obj2 = new Object();
        ((C0909e) this.f25752e).f3321e = obj2;
        this.f25752e = obj2;
        obj2.f3322e = obj;
        obj2.f3323e = str;
    }

    public C1127e mopub() {
        C17974e c17974e;
        C15768e ad;
        C9622e c9622e = (C9622e) this.f25751e;
        if (c9622e == null || (c17974e = (C17974e) this.f25750e) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c9622e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c9622e.ad() && ((Integer) this.f25752e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C9622e) this.f25751e).ad() && ((Integer) this.f25752e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C2942e c2942e = ((C9622e) this.f25751e).metrica;
        if (c2942e == C2942e.appmetrica) {
            ad = AbstractC16176e.ad;
        } else if (c2942e == C2942e.license || c2942e == C2942e.metrica) {
            ad = AbstractC16176e.ad(((Integer) this.f25752e).intValue());
        } else {
            if (c2942e != C2942e.vip) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((C9622e) this.f25751e).metrica);
            }
            ad = AbstractC16176e.vip(((Integer) this.f25752e).intValue());
        }
        return new C1127e((C9622e) this.f25751e, (C17974e) this.f25750e, ad, (Integer) this.f25752e);
    }

    public void premium(C7869e c7869e, int i, boolean z) {
        char c;
        C6176e c6176e = (C6176e) this.f25752e;
        Context context = (Context) this.f25751e;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c7869e.ad;
        String str2 = c7869e.ad;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC6651e enumC6651e = c7869e.metrica;
        adler32.update(allocate.putInt(AbstractC12589e.ad(enumC6651e)).array());
        byte[] bArr = c7869e.vip;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC12640e.billing("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c7869e);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((C2417e) ((InterfaceC8685e) this.f25750e)).ad().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(AbstractC12589e.ad(enumC6651e))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c6176e.ad(enumC6651e, longValue, i));
            Set set = ((C17600e) c6176e.vip.get(enumC6651e)).metrica;
            if (set.contains(EnumC17662e.f34618e)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC17662e.f34615e)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC17662e.f34616e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", AbstractC12589e.ad(enumC6651e));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(c6176e.ad(enumC6651e, longValue, i));
            Integer valueOf4 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = c7869e;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String mopub = AbstractC12640e.mopub("JobInfoScheduler");
            if (Log.isLoggable(mopub, 3)) {
                Log.d(mopub, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public int pro() {
        C14870e c14870e = (C14870e) this.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        if (c14870e.ad.isEmpty()) {
            return -1;
        }
        C14870e c14870e2 = (C14870e) this.f25750e;
        if (c14870e2 == null) {
            c14870e2 = null;
        }
        long j = ((C8518e) AbstractC13480e.m3591interface(c14870e2.ad)).ad - (((C14870e) this.f25750e) != null ? r0 : null).yandex;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    @Override // defpackage.InterfaceC14020e
    public Size purchase(C18525e c18525e, C14677e c14677e) {
        C5363e c5363e = (C5363e) this.f25752e;
        if (AbstractC17140e.vip(c14677e, ((C9368e) c5363e.getValue()).ad)) {
            return (Size) ((C9368e) c5363e.getValue()).vip.get(c18525e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        return new C15188e((InterfaceC1726e) this.f25750e, (C16911e) this.f25751e, (C15660e) this.f25752e);
    }

    public boolean signatures() {
        C14870e c14870e = (C14870e) this.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        return !c14870e.ad.isEmpty();
    }

    public C7869e startapp() {
        String str = ((String) this.f25751e) == null ? " backendName" : BuildConfig.FLAVOR;
        if (((EnumC6651e) this.f25752e) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new C7869e((String) this.f25751e, (byte[]) this.f25750e, (EnumC6651e) this.f25752e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC0274e subs() {
        return (C9674e) this.f25752e;
    }

    public int tapsense() {
        C14870e c14870e = (C14870e) this.f25750e;
        if (c14870e == null) {
            c14870e = null;
        }
        if (c14870e.ad.isEmpty()) {
            return -1;
        }
        C14870e c14870e2 = (C14870e) this.f25750e;
        if (c14870e2 == null) {
            c14870e2 = null;
        }
        long j = ((C8518e) AbstractC13480e.m3570break(c14870e2.ad)).ad + (((C14870e) this.f25750e) != null ? r0 : null).yandex;
        long isPro = isPro() - 1;
        if (j > isPro) {
            j = isPro;
        }
        return (int) j;
    }

    public String toString() {
        switch (this.f25753e) {
            case 23:
                return "MimeMatchedVideoCapabilities(mime=" + ((String) this.f25751e) + ", cameraInfo=" + ((InterfaceC12424e) this.f25750e) + ')';
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f25751e);
                sb.append('{');
                C0909e c0909e = (C0909e) ((C0909e) this.f25750e).f3321e;
                String str = BuildConfig.FLAVOR;
                while (c0909e != null) {
                    Object obj = c0909e.f3322e;
                    sb.append(str);
                    String str2 = (String) c0909e.f3323e;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    c0909e = (C0909e) c0909e.f3321e;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vip(long j, String str) {
        license(str, String.valueOf(j));
    }

    public C12892e yandex() {
        C17974e c17974e;
        C15768e vip;
        C14664e c14664e = (C14664e) this.f25751e;
        if (c14664e == null || (c17974e = (C17974e) this.f25750e) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (c14664e.ad != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c14664e.ad() && ((Integer) this.f25752e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C14664e) this.f25751e).ad() && ((Integer) this.f25752e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C8776e c8776e = ((C14664e) this.f25751e).vip;
        if (c8776e == C8776e.license) {
            vip = AbstractC16176e.ad;
        } else if (c8776e == C8776e.metrica) {
            vip = AbstractC16176e.ad(((Integer) this.f25752e).intValue());
        } else {
            if (c8776e != C8776e.vip) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((C14664e) this.f25751e).vip);
            }
            vip = AbstractC16176e.vip(((Integer) this.f25752e).intValue());
        }
        return new C12892e((C14664e) this.f25751e, (C17974e) this.f25750e, vip, (Integer) this.f25752e);
    }
}
