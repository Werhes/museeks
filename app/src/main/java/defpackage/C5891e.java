package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5891e implements InterfaceC12457e, InterfaceC10770e, InterfaceC7218e, InterfaceC4777e, InterfaceC14812e, InterfaceC15269e, InterfaceC2295e, InterfaceC0569e, InterfaceC8615e, InterfaceC17556e, InterfaceC10283e, InterfaceC10625e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f12439e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f12440e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12441e;

    public C5891e(int i) {
        this.f12441e = i;
        switch (i) {
            case 11:
                this.f12440e = null;
                this.f12439e = null;
                return;
            case 15:
                return;
            case 20:
                this.f12440e = new C14595e(10);
                this.f12439e = new C4662e(16);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                this.f12440e = new C1292e();
                this.f12439e = new C4495e();
                return;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                C0002e c0002e = C0002e.appmetrica;
                this.f12440e = new SparseIntArray();
                this.f12439e = c0002e;
                return;
            default:
                this.f12440e = new C12431e(0, new C13915e[16]);
                return;
        }
    }

    public C5891e(Context context, C13765e c13765e) {
        this.f12441e = 1;
        this.f12439e = DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12440e = new C8603e(context, c13765e);
        } else {
            this.f12440e = new C8603e(context, c13765e);
        }
    }

    public C5891e(ViewPager viewPager) {
        this.f12441e = 21;
        this.f12439e = viewPager;
        this.f12440e = new Rect();
    }

    public C5891e(WorkDatabase_Impl workDatabase_Impl) {
        this.f12441e = 27;
        this.f12440e = workDatabase_Impl;
        this.f12439e = new C3606e(workDatabase_Impl, 3);
    }

    public C5891e(C1410e c1410e, int[] iArr) {
        this.f12441e = 4;
        this.f12440e = AbstractC17475e.remoteconfig(c1410e);
        this.f12439e = iArr;
    }

    public C5891e(C3560e c3560e) {
        this.f12441e = 13;
        this.f12440e = c3560e;
        this.f12439e = new C3168e(12, c3560e);
    }

    public C5891e(C8010e c8010e) {
        this.f12441e = 9;
        this.f12440e = c8010e;
        this.f12439e = new C1292e();
    }

    public C5891e(C11807e c11807e) {
        this.f12441e = 17;
        this.f12440e = c11807e;
        this.f12439e = null;
    }

    public C5891e(C14679e c14679e) {
        this.f12441e = 7;
        this.f12439e = c14679e;
    }

    public /* synthetic */ C5891e(Object obj, Object obj2, int i) {
        this.f12441e = i;
        this.f12440e = obj;
        this.f12439e = obj2;
    }

    public /* synthetic */ C5891e(Object obj, Object obj2, boolean z, int i) {
        this.f12441e = i;
        this.f12439e = obj;
        this.f12440e = obj2;
    }

    public C5891e(Map map) {
        this.f12441e = 5;
        this.f12440e = map;
        this.f12439e = new C6272e("Java nullability annotation states").metrica(new C17877e(29, this));
    }

    public C5891e(byte[] bArr, Provider provider) {
        this.f12441e = 8;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f12440e = new SecretKeySpec(bArr, "AES");
        this.f12439e = provider;
    }

    public C5891e(InterfaceC12457e[] interfaceC12457eArr) {
        this.f12441e = 3;
        this.f12440e = interfaceC12457eArr;
        this.f12439e = new C11672e(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void crashlytics(C13915e c13915e) {
        if (c13915e.f27595e > 0) {
            if (c13915e.f27612e.license == 5 && !c13915e.admob() && !c13915e.subscription() && !c13915e.f27620e && c13915e.m3724throw()) {
                AbstractC13616e abstractC13616e = (AbstractC13616e) c13915e.f27592e.billing;
                if ((abstractC13616e.f27020e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    while (abstractC13616e != null) {
                        if ((abstractC13616e.f27014e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            AbstractC6126e abstractC6126e = abstractC13616e;
                            ?? r5 = 0;
                            while (abstractC6126e != 0) {
                                if (abstractC6126e instanceof InterfaceC9629e) {
                                    InterfaceC9629e interfaceC9629e = (InterfaceC9629e) abstractC6126e;
                                    interfaceC9629e.mo721try(AbstractC5851e.yandex(interfaceC9629e, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                                } else if ((abstractC6126e.f27014e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                    AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                                    int i = 0;
                                    abstractC6126e = abstractC6126e;
                                    r5 = r5;
                                    while (abstractC13616e2 != null) {
                                        if ((abstractC13616e2.f27014e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                abstractC6126e = abstractC13616e2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC6126e != 0) {
                                                    r5.license(abstractC6126e);
                                                    abstractC6126e = 0;
                                                }
                                                r5.license(abstractC13616e2);
                                            }
                                        }
                                        abstractC13616e2 = abstractC13616e2.f27024e;
                                        abstractC6126e = abstractC6126e;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC6126e = AbstractC5851e.vip(r5);
                            }
                        }
                        if ((abstractC13616e.f27020e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                            break;
                        } else {
                            abstractC13616e = abstractC13616e.f27024e;
                        }
                    }
                }
            }
            c13915e.f27600e = false;
            C12431e ads = c13915e.ads();
            Object[] objArr = ads.f24870e;
            int i2 = ads.f24868e;
            for (int i3 = 0; i3 < i2; i3++) {
                crashlytics((C13915e) objArr[i3]);
            }
        }
    }

    public static void premium(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    @Override // defpackage.InterfaceC8615e
    public void Signature(Activity activity) {
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m1989abstract(C17571e c17571e) {
        C8603e c8603e = (C8603e) this.f12440e;
        if ((c8603e.ad.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", AbstractC11866e.ad(c17571e, MediaDescriptionCompat.CREATOR));
        c8603e.ad.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    @Override // defpackage.InterfaceC4777e
    public C18451e ad(InterfaceC2283e interfaceC2283e, long j) {
        long position = interfaceC2283e.getPosition();
        int min = (int) Math.min(20000L, interfaceC2283e.getLength() - position);
        C1292e c1292e = (C1292e) this.f12439e;
        c1292e.m564extends(min);
        interfaceC2283e.ad(0, min, c1292e.ad);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (c1292e.ad() >= 4) {
            if (C11016e.m2984interface(c1292e.vip, c1292e.ad) != 442) {
                c1292e.m568protected(1);
            } else {
                c1292e.m568protected(4);
                long metrica = C11737e.metrica(c1292e);
                if (metrica != -9223372036854775807L) {
                    long vip = ((C8010e) this.f12440e).vip(metrica);
                    if (vip > j) {
                        return j2 == -9223372036854775807L ? new C18451e(-1, vip, position) : new C18451e(0, -9223372036854775807L, position + i2);
                    }
                    if (vip + 100000 > j) {
                        return new C18451e(0, -9223372036854775807L, position + c1292e.vip);
                    }
                    j2 = vip;
                    i2 = c1292e.vip;
                }
                int i3 = c1292e.metrica;
                if (c1292e.ad() >= 10) {
                    c1292e.m568protected(9);
                    int ads = c1292e.ads() & 7;
                    if (c1292e.ad() >= ads) {
                        c1292e.m568protected(ads);
                        if (c1292e.ad() >= 4) {
                            if (C11016e.m2984interface(c1292e.vip, c1292e.ad) == 443) {
                                c1292e.m568protected(4);
                                int m565goto = c1292e.m565goto();
                                if (c1292e.ad() < m565goto) {
                                    c1292e.m571try(i3);
                                } else {
                                    c1292e.m568protected(m565goto);
                                }
                            }
                            while (true) {
                                if (c1292e.ad() < 4) {
                                    break;
                                }
                                int m2984interface = C11016e.m2984interface(c1292e.vip, c1292e.ad);
                                if (m2984interface == 442 || m2984interface == 441 || (m2984interface >>> 8) != 1) {
                                    break;
                                }
                                c1292e.m568protected(4);
                                if (c1292e.ad() < 2) {
                                    c1292e.m571try(i3);
                                    break;
                                }
                                c1292e.m571try(Math.min(c1292e.metrica, c1292e.vip + c1292e.m565goto()));
                            }
                        } else {
                            c1292e.m571try(i3);
                        }
                    } else {
                        c1292e.m571try(i3);
                    }
                } else {
                    c1292e.m571try(i3);
                }
                i = c1292e.vip;
            }
        }
        return j2 != -9223372036854775807L ? new C18451e(-2, j2, position + i) : C18451e.appmetrica;
    }

    @Override // defpackage.InterfaceC8615e
    public List adcel() {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC14812e
    public void admob(C7967e c7967e) {
        boolean z;
        C13343e c13343e = (C13343e) this.f12439e;
        C9556e c9556e = c13343e.signatures;
        if (c13343e.mopub) {
            AbstractC9464e.yandex("Recorder", "Drop video data since recording is stopping.");
            c7967e.close();
            return;
        }
        C7967e c7967e2 = c13343e.pro;
        if (c7967e2 != null) {
            c7967e2.close();
            c13343e.pro = null;
            z = true;
        } else {
            z = false;
        }
        if ((c7967e.f16139e.flags & 1) == 0) {
            if (z) {
                AbstractC9464e.yandex("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            AbstractC9464e.yandex("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            C18405e c18405e = c13343e.remoteconfig;
            c18405e.yandex.execute(new RunnableC4127e(c18405e, 2));
            c7967e.close();
            return;
        }
        c13343e.pro = c7967e;
        if (c13343e.ads == 4 && c9556e.m2614extends()) {
            if (z) {
                AbstractC9464e.yandex("Recorder", "Replaced cached video keyframe with newer keyframe.");
                return;
            } else {
                AbstractC9464e.yandex("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                return;
            }
        }
        AbstractC9464e.yandex("Recorder", "Received video keyframe. Starting muxer...");
        if (c13343e.ads == 4 && c9556e.m2614extends()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start muxer.");
        }
        C7967e c7967e3 = c13343e.pro;
        if (c7967e3 == null) {
            throw new AssertionError("Muxer cannot be started without an encoded video frame.");
        }
        try {
            c13343e.pro = null;
            long j = c7967e3.f16139e.presentationTimeUs;
            ArrayList arrayList = new ArrayList();
            while (!c9556e.m2614extends()) {
                C7967e c7967e4 = (C7967e) c9556e.mopub();
                if (c7967e4.f16139e.presentationTimeUs >= j) {
                    arrayList.add(c7967e4);
                }
            }
            c7967e3.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C7967e) it.next()).size();
            }
            try {
                if (((C18247e) C13343e.mopub(c13343e.subscription)).vip != -1) {
                    throw null;
                }
                C1296e c1296e = c13343e.advert;
                int i = C13343e.f26596interface.vip;
                if (c1296e == null) {
                    throw null;
                }
                int i2 = c1296e.vip;
                if (i2 == 1) {
                    throw null;
                }
                if (i2 == 2) {
                    throw null;
                }
                throw null;
            } catch (IOException e) {
                if (!AbstractC11309e.startapp(e)) {
                    throw null;
                }
                c13343e.amazon(3, e);
                c7967e3.close();
            }
        } catch (Throwable th) {
            try {
                c7967e3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public C11376e ads(int i, InterfaceC12424e interfaceC12424e, ArrayList arrayList, Map map, HashMap hashMap, boolean z) {
        int i2;
        Rect rect;
        boolean z2;
        C14132e c14132e;
        String billing = interfaceC12424e.billing();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rect = interfaceC12424e.mopub();
            } catch (NullPointerException unused) {
                rect = null;
            }
            C6148e c6148e = new C6148e(interfaceC12424e, rect != null ? AbstractC8261e.purchase(rect) : null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                Object obj = hashMap.get(abstractC16510e);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C1211e c1211e = (C1211e) obj;
                InterfaceC12438e loadAd = abstractC16510e.loadAd(interfaceC12424e, c1211e.ad, c1211e.vip);
                linkedHashMap2.put(loadAd, abstractC16510e);
                linkedHashMap3.put(loadAd, c6148e.yandex(loadAd));
            }
            int metrica = AbstractC13350e.metrica(arrayList, new C6538e(hashMap, interfaceC12424e, 18));
            C5139e c5139e = (C5139e) this.f12439e;
            if (c5139e == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                AbstractC16510e abstractC16510e2 = (AbstractC16510e) it2.next();
                if (abstractC16510e2 != null) {
                    z2 = true;
                    if (AbstractC13350e.license(abstractC16510e2)) {
                        break;
                    }
                }
            }
            boolean z3 = z2;
            AbstractC4265e.license(c5139e.license.containsKey(billing), "No such camera id in supported combination list: ".concat(billing));
            synchronized (c5139e.metrica) {
                c14132e = (C14132e) c5139e.license.get(billing);
            }
            if (c14132e == null) {
                throw new IllegalArgumentException("No such camera id in supported combination list: ".concat(billing));
            }
            C9984e mopub = c14132e.mopub(i, arrayList2, linkedHashMap3, metrica, z3, z);
            LinkedHashMap linkedHashMap4 = mopub.ad;
            LinkedHashMap linkedHashMap5 = mopub.vip;
            i2 = mopub.metrica;
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = linkedHashMap4.get(entry.getKey());
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, obj2);
            }
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(obj3, entry2.getValue());
                }
            }
        }
        return new C11376e(i2, linkedHashMap);
    }

    @Override // defpackage.InterfaceC12457e
    public StackTraceElement[] advert(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC12457e[] interfaceC12457eArr = (InterfaceC12457e[]) this.f12440e;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            InterfaceC12457e interfaceC12457e = interfaceC12457eArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = interfaceC12457e.advert(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((C11672e) this.f12439e).advert(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // defpackage.InterfaceC8615e
    public InterfaceC8346e amazon() {
        C1169e license = AbstractC6874e.license();
        smaato(license, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (r15 & 4) == 0, (r15 & 8) == 0, new C9028e(this, 0));
        smaato(license, R.drawable.ic_share_outline_28, R.string.share, (r15 & 4) == 0, (r15 & 8) == 0, new C9028e(this, 1));
        smaato(license, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (r15 & 4) == 0, (r15 & 8) == 0, new C9369e(26));
        return AbstractC8228e.metrica(AbstractC6874e.metrica(license));
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map, java.lang.Object] */
    public C11376e applovin(int i, InterfaceC12424e interfaceC12424e, ArrayList arrayList, ArrayList arrayList2, InterfaceC3232e interfaceC3232e, int i2, Range range, boolean z) {
        C14132e c14132e;
        ArrayList arrayList3 = new ArrayList();
        String billing = interfaceC12424e.billing();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            C6884e c6884e = abstractC16510e.startapp;
            if (c6884e == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            C5139e c5139e = (C5139e) this.f12439e;
            if (c5139e == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int advert = abstractC16510e.yandex.advert();
            Size metrica = abstractC16510e.metrica();
            if (metrica == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            EnumC2392e mo837native = abstractC16510e.yandex.mo837native();
            AbstractC4265e.license(c5139e.license.containsKey(billing), "No such camera id in supported combination list: ".concat(billing));
            synchronized (c5139e.metrica) {
                c14132e = (C14132e) c5139e.license.get(billing);
            }
            if (c14132e == null) {
                throw new IllegalArgumentException("No such camera id in supported combination list: ".concat(billing));
            }
            EnumC2392e enumC2392e = C4637e.appmetrica;
            C4637e pro = C16728e.pro(advert, metrica, c14132e.smaato(advert), i, 2, mo837native);
            int advert2 = abstractC16510e.yandex.advert();
            Size metrica2 = abstractC16510e.metrica();
            C14677e c14677e = c6884e.metrica;
            ArrayList arrayList4 = new ArrayList();
            if (abstractC16510e instanceof C14402e) {
                Iterator it2 = ((C14402e) abstractC16510e).pro.f16692e.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((AbstractC16510e) it2.next()).yandex.mo844while());
                }
            } else {
                arrayList4.add(abstractC16510e.yandex.mo844while());
            }
            InterfaceC12330e interfaceC12330e = c6884e.purchase;
            int mo834break = abstractC16510e.yandex.mo834break();
            Range mo833abstract = abstractC16510e.yandex.mo833abstract(C6884e.yandex);
            if (mo833abstract == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C6355e c6355e = new C6355e(pro, advert2, metrica2, c14677e, arrayList4, interfaceC12330e, mo834break, mo833abstract, abstractC16510e.yandex.mo838private(), abstractC16510e.yandex.mo839protected(abstractC16510e.metrica()));
            arrayList3.add(c6355e);
            linkedHashMap2.put(c6355e, abstractC16510e);
            linkedHashMap.put(abstractC16510e, c6884e);
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Map map = (Map) pair.second;
        C6594e c6594e = (C6594e) interfaceC3232e;
        c6594e.getClass();
        int i3 = AbstractC3521e.ad;
        C11376e ads = ads(i, interfaceC12424e, arrayList, map, C10302e.applovin(arrayList, (InterfaceC4311e) ((C17015e) c6594e.mopub()).smaato(InterfaceC3232e.metrica, InterfaceC4311e.ad), (C11807e) this.f12440e, i2, range), z);
        return new C11376e(ads.vip, AbstractC10064e.yandex((Map) pair.first, ads.ad));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (defpackage.AbstractC5336e.advert(r8, r1, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8.subscription(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.InterfaceC8615e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object appmetrica(boolean r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C9955e
            if (r0 == 0) goto L13
            r0 = r8
            eَؐؖ r0 = (defpackage.C9955e) r0
            int r1 = r0.f19673e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19673e = r1
            goto L18
        L13:
            eَؐؖ r0 = new eَؐؖ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f19671e
            int r1 = r0.f19673e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r7 = r0.f19672e
            defpackage.AbstractC2003e.purchase(r8)
            goto L53
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            eْؕؖ r8 = new eْؕؖ
            java.lang.Object r1 = r6.f12440e
            ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist r1 = (ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist) r1
            java.lang.String r1 = r1.vip
            r5 = 27
            r8.<init>(r1, r5)
            r0.f19672e = r7
            r0.f19673e = r3
            java.lang.Object r8 = r8.subscription(r0)
            if (r8 != r4) goto L53
            goto L69
        L53:
            eّٕٓ r8 = defpackage.AbstractC6731e.ad
            eْؐؔ r8 = defpackage.AbstractC1497e.ad
            eّۤ r1 = new eّۤ
            r3 = 0
            r5 = 25
            r1.<init>(r6, r3, r5)
            r0.f19672e = r7
            r0.f19673e = r2
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r8, r1, r0)
            if (r7 != r4) goto L6a
        L69:
            return r4
        L6a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5891e.appmetrica(boolean, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14812e
    public void billing(C2123e c2123e) {
        ((C7169e) this.f12440e).metrica(c2123e);
    }

    /* renamed from: break, reason: not valid java name */
    public C0100e m1990break() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m1993class());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = C0100e.yandex;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = AbstractC8703e.m2468interface(5)[optInt];
        if (i2 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i2 != 0) {
            return new C0100e(optString, i2, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }

    /* renamed from: case, reason: not valid java name */
    public int m1991case(Context context, InterfaceC2367e interfaceC2367e) {
        AbstractC9528e.startapp(context);
        AbstractC9528e.startapp(interfaceC2367e);
        int i = 0;
        if (!interfaceC2367e.ad()) {
            return 0;
        }
        int vip = interfaceC2367e.vip();
        int m1992catch = m1992catch(vip);
        if (m1992catch != -1) {
            return m1992catch;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12440e;
        synchronized (sparseIntArray) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > vip && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i == -1) {
                i = ((C0002e) this.f12439e).metrica(context, vip);
            }
            sparseIntArray.put(vip, i);
        }
        return i;
    }

    /* renamed from: catch, reason: not valid java name */
    public int m1992catch(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f12440e;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    /* renamed from: class, reason: not valid java name */
    public File m1993class() {
        if (((File) this.f12440e) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f12440e) == null) {
                        String str = "PersistedInstallation." + ((C14679e) this.f12439e).license() + ".json";
                        C14679e c14679e = (C14679e) this.f12439e;
                        c14679e.ad();
                        File file = new File(c14679e.ad.getNoBackupFilesDir(), str);
                        this.f12440e = file;
                        if (file.exists()) {
                            return (File) this.f12440e;
                        }
                        C14679e c14679e2 = (C14679e) this.f12439e;
                        c14679e2.ad();
                        File file2 = new File(c14679e2.ad.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f12440e)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f12440e;
    }

    /* renamed from: default, reason: not valid java name */
    public void m1994default(C4734e c4734e) {
        c4734e.isVip("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c4734e.isVip("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        ViewPager viewPager = (ViewPager) this.f12439e;
        C12948e adcel = AbstractC2016e.adcel(view, c12948e);
        if (adcel.ad.remoteconfig()) {
            return adcel;
        }
        Rect rect = (Rect) this.f12440e;
        rect.left = adcel.vip();
        rect.top = adcel.license();
        rect.right = adcel.metrica();
        rect.bottom = adcel.ad();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C12948e metrica = AbstractC2016e.metrica(viewPager.getChildAt(i), adcel);
            rect.left = Math.min(metrica.vip(), rect.left);
            rect.top = Math.min(metrica.license(), rect.top);
            rect.right = Math.min(metrica.metrica(), rect.right);
            rect.bottom = Math.min(metrica.ad(), rect.bottom);
        }
        return adcel.purchase(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(8:12|13|14|(1:16)|17|(1:19)|20|(2:22|23)(2:25|26))(2:28|29))(2:30|31))(3:32|33|34))(14:50|51|52|53|54|55|56|57|(1:59)(5:67|68|69|70|71)|60|(1:62)|63|(1:65)|44)|35|36|(1:38)|39|(2:41|(0)(1:43))(1:45)|44))|83|6|7|(0)(0)|35|36|(0)|39|(0)(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
    
        if (r15 == r10) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x003b, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        r15 = new defpackage.C12763e(r14);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #5 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0128, B:45:0x0112), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r3v2, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object firebase(defpackage.AbstractC7654e r14, defpackage.AbstractC10731e r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5891e.firebase(eًٟؑ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C1253e((InterfaceC14502e) ((InterfaceC16964e) this.f12440e).get(), (InterfaceC14502e) ((InterfaceC18006e) this.f12439e).get());
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (AppBarLayout) this.f12440e;
    }

    /* renamed from: goto, reason: not valid java name */
    public C4820e m1995goto() {
        C8603e c8603e = (C8603e) this.f12440e;
        InterfaceC16274e ad = c8603e.appmetrica.ad();
        if (ad != null) {
            try {
                return ad.billing();
            } catch (RemoteException | SecurityException e) {
                AbstractC2803e.billing("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = c8603e.ad.getPlaybackState();
        if (playbackState != null) {
            return C4820e.ad(playbackState);
        }
        return null;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m1996implements(C1169e c1169e, int i, int i2, Function1 function1) {
        c1169e.add(new C1490e(i, i2, false, function1));
    }

    @Override // defpackage.InterfaceC8615e
    public C14623e inmobi() {
        CatalogArtist catalogArtist = (CatalogArtist) this.f12440e;
        String ad = catalogArtist.ad();
        if (ad == null) {
            ad = BuildConfig.FLAVOR;
        }
        return new C14623e(ad, catalogArtist.ad, null, true);
    }

    /* renamed from: interface, reason: not valid java name */
    public ArrayList m1997interface() {
        Map map = (Map) this.f12440e;
        String str = (String) this.f12439e;
        String str2 = (String) map.get(AbstractC17190e.license(str, "size"));
        if (str2 == null) {
            throw new C2123e(0, AbstractC5087e.m1746extends("Property ", str, ".size not found."), null);
        }
        C15926e admob = AbstractC3062e.admob(0, Integer.parseInt(str2));
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(admob, 10));
        Iterator it = admob.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                return arrayList;
            }
            arrayList.add((String) map.get(AbstractC17190e.license(str, String.valueOf(c3296e.nextInt()))));
        }
    }

    public void isPro(C17571e c17571e, int i) {
        C8603e c8603e = (C8603e) this.f12440e;
        if ((c8603e.ad.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", AbstractC11866e.ad(c17571e, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        c8603e.ad.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    @Override // defpackage.InterfaceC4777e
    public void isVip() {
        C1292e c1292e = (C1292e) this.f12439e;
        byte[] bArr = AbstractC9413e.vip;
        c1292e.getClass();
        c1292e.m570throw(bArr.length, bArr);
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        switch (this.f12441e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((InterfaceC0867e) this.f12440e).accept(new C17756e(0, (Surface) this.f12439e));
                return;
            default:
                AbstractC4265e.yandex("Unexpected result from SurfaceRequest. Surface was provided twice.", ((C17756e) obj).ad != 3);
                AbstractC9464e.yandex("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.f12440e).release();
                C0748e c0748e = ((TextureViewSurfaceTextureListenerC4255e) this.f12439e).ad;
                if (c0748e.adcel != null) {
                    c0748e.adcel = null;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC8615e
    public InterfaceC1133e loadAd() {
        return new C0444e((CatalogArtist) this.f12440e);
    }

    @Override // defpackage.InterfaceC8615e
    public Integer metrica() {
        return null;
    }

    @Override // defpackage.InterfaceC14812e
    public void mopub() {
        ((C7169e) this.f12440e).ad(null);
    }

    /* renamed from: native, reason: not valid java name */
    public C13935e m1998native() {
        MediaController.TransportControls transportControls = ((C8603e) this.f12440e).ad.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 && i >= 24) {
            return new C13935e(transportControls);
        }
        return new C13935e(transportControls);
    }

    @Override // defpackage.InterfaceC8615e
    public Object pro(C14358e c14358e) {
        return Unit.INSTANCE;
    }

    /* renamed from: protected, reason: not valid java name */
    public void m1999protected(Bundle bundle) {
        C3560e c3560e = (C3560e) this.f12440e;
        Bundle vip = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
        Bundle bundle2 = (Bundle) c3560e.yandex;
        if (bundle2 != null) {
            vip.putAll(bundle2);
        }
        synchronized (((C10215e) c3560e.purchase)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) c3560e.billing).entrySet()) {
                    vip.putBundle((String) entry.getKey(), ((InterfaceC8498e) entry.getValue()).ad());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vip.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", vip);
    }

    @Override // defpackage.InterfaceC8615e
    public InterfaceC8346e purchase() {
        C1169e license = AbstractC6874e.license();
        File file = AbstractC14119e.ad;
        if (AbstractC14119e.vip.containsKey(((CatalogArtist) this.f12440e).vip)) {
            m1996implements(license, R.drawable.ic_block_outline_28, R.string.artistmenu_remove_from_blacklist, new C9028e(this, 2));
        } else {
            m1996implements(license, R.drawable.ic_block_outline_28, R.string.artistmenu_to_blacklist, new C9028e(this, 3));
        }
        m1996implements(license, R.drawable.ic_download_cloud_outline_28, R.string.artistmenu_to_mp3, new C9028e(this, 4));
        return AbstractC8228e.metrica(AbstractC6874e.metrica(license));
    }

    @Override // defpackage.InterfaceC8615e
    public void remoteconfig(C3566e c3566e) {
        if (((CatalogArtist) this.f12440e).yandex) {
            c3566e.m1377this(EnumC10826e.f21458e);
        } else {
            AbstractC16519e.vip((AppActivity) c3566e.f10582e, new C7195e(this, c3566e, null, 9));
        }
    }

    @Override // defpackage.InterfaceC10625e
    public /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC8615e
    public Object signatures(C12972e c12972e) {
        return new Long(-2L);
    }

    @Override // defpackage.InterfaceC8615e
    public void smaato(C1169e c1169e, int i, int i2, boolean z, boolean z2, Function1 function1) {
        c1169e.add(new C1637e(i, i2, z, z2, function1));
    }

    @Override // defpackage.InterfaceC14812e
    public void startapp(C12582e c12582e) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subs() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12440e
            eّّؔ r0 = (defpackage.C12431e) r0
            eُٖ r1 = defpackage.C11021e.f21838e
            java.lang.Object[] r2 = r0.f24870e
            int r3 = r0.f24868e
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.f24868e
            java.lang.Object r2 = r6.f12439e
            eِٓؔ[] r2 = (defpackage.C13915e[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            eِٓؔ[] r2 = new defpackage.C13915e[r2]
        L21:
            r3 = 0
            r6.f12439e = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.f24870e
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.startapp()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L45
            r0 = r2[r1]
            boolean r4 = r0.f27600e
            if (r4 == 0) goto L40
            crashlytics(r0)
        L40:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L45:
            r6.f12439e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5891e.subs():void");
    }

    @Override // defpackage.InterfaceC8615e
    public boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC7218e
    public byte[] tapsense(int i, byte[] bArr) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f12439e);
        mac.init((SecretKeySpec) this.f12440e);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* renamed from: throw, reason: not valid java name */
    public void m2000throw(C0100e c0100e) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0100e.ad);
            jSONObject.put("Status", AbstractC8703e.m2467class(c0100e.vip));
            jSONObject.put("AuthToken", c0100e.metrica);
            jSONObject.put("RefreshToken", c0100e.license);
            jSONObject.put("TokenCreationEpochInSecs", c0100e.purchase);
            jSONObject.put("ExpiresInSecs", c0100e.appmetrica);
            jSONObject.put("FisError", c0100e.billing);
            C14679e c14679e = (C14679e) this.f12439e;
            c14679e.ad();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", c14679e.ad.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m1993class())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public String toString() {
        switch (this.f12441e) {
            case 23:
                return ((InterfaceC7004e) this.f12440e) + " - " + ((C5401e) this.f12439e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C2443e) this.f12440e) + " = " + ((InterfaceC7004e) this.f12439e) + ";";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a5, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(defpackage.C4495e.vip(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, eِؓ۠] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo825transient(byte[] r19, int r20, int r21, defpackage.C14033e r22, defpackage.InterfaceC8427e r23) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5891e.mo825transient(byte[], int, int, eٓٗۢ, eٌؑۘ):void");
    }

    /* renamed from: try, reason: not valid java name */
    public void m2001try(Bundle bundle) {
        C3560e c3560e = (C3560e) this.f12440e;
        InterfaceC10998e interfaceC10998e = (InterfaceC10998e) c3560e.license;
        if (!c3560e.ad) {
            c3560e.ad();
        }
        if (((C4891e) interfaceC10998e.vip()).license.ad(EnumC7785e.f15779e)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((C4891e) interfaceC10998e.vip()).license).toString());
        }
        if (c3560e.vip) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = AbstractC1596e.vip("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c3560e.yandex = bundle2;
        c3560e.vip = true;
    }

    @Override // defpackage.InterfaceC8615e
    public boolean vip() {
        return ((CatalogArtist) this.f12440e).yandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0071 A[EDGE_INSN: B:79:0x0071->B:63:0x0071 BREAK  A[LOOP:3: B:43:0x0024->B:64:?], SYNTHETIC] */
    /* renamed from: while, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2002while(defpackage.C4734e r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5891e.m2002while(eًٍؗ, int, int):void");
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        switch (this.f12441e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                AbstractC4265e.yandex("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof C9336e);
                ((InterfaceC0867e) this.f12440e).accept(new C17756e(1, (Surface) this.f12439e));
                return;
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }
}
