package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import androidx.car.app.navigation.model.Maneuver;
import androidx.cardview.widget.CardView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۨۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C18540e implements InterfaceC2062e, InterfaceC18372e, InterfaceC17564e, InterfaceC11660e, InterfaceC2295e, InterfaceC1325e, InterfaceC0987e, InterfaceC2868e, InterfaceC3896e, InterfaceC10864e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C18540e f36378e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static volatile C18540e f36379e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static ServiceConnectionC18505e f36380e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f36382e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f36383e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36384e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final int[] f36377e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f36381e = new Object();

    static {
        Object obj = null;
        f36378e = new C18540e(obj, obj, 3);
    }

    public C18540e(int i) {
        this.f36384e = i;
        switch (i) {
            case 12:
                this.f36383e = new HashMap();
                this.f36382e = new ArrayList();
                return;
            case 14:
                this.f36383e = new HashSet();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f36383e = new int[16];
                this.f36382e = new int[16];
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f36383e = new SparseIntArray();
                this.f36382e = new SparseIntArray();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f36383e = new ArrayList();
                this.f36382e = new C11698e();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f36383e = new ArrayList(0);
                this.f36382e = new ArrayList(0);
                return;
            default:
                this.f36383e = r3;
                String[] strArr = {"Blues", "Classic Rock", FrameBodyTXXX.COUNTRY, "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "Acapella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "JPop", "SynthPop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big Beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio Theatre", "Neue Deutsche Welle", "Podcast", "Indie Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
                return;
        }
    }

    public C18540e(Context context) {
        this.f36384e = 2;
        this.f36383e = context;
        this.f36382e = new ExecutorC14279e(2);
    }

    public C18540e(AbsSeekBar absSeekBar) {
        this.f36384e = 1;
        this.f36383e = absSeekBar;
    }

    public C18540e(CardView cardView) {
        this.f36384e = 10;
        this.f36382e = cardView;
    }

    public C18540e(WorkDatabase_Impl workDatabase_Impl) {
        this.f36384e = 15;
        this.f36383e = workDatabase_Impl;
        this.f36382e = new C3606e(workDatabase_Impl, 0);
    }

    public C18540e(AbstractC0641e abstractC0641e) {
        this.f36384e = 23;
        Iterator it = ((C10442e) abstractC0641e.f2878e.ad.entrySet()).iterator();
        this.f36383e = it;
        if (it.hasNext()) {
            this.f36382e = (Map.Entry) it.next();
        }
    }

    public C18540e(C1244e c1244e) {
        this.f36384e = 8;
        this.f36383e = new AbstractC4857e[]{c1244e.vip, c1244e.appmetrica, c1244e.metrica};
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f36382e = paint;
    }

    public C18540e(C1364e c1364e) {
        this.f36384e = 29;
        if (c1364e == null) {
            throw new NullPointerException("'privateKey' cannot be null");
        }
        this.f36383e = c1364e;
        this.f36382e = ((C12532e) c1364e.f3209e).ad();
    }

    public C18540e(InterfaceC5334e interfaceC5334e, C11980e c11980e, AbstractC13010e abstractC13010e) {
        this.f36384e = 5;
        this.f36383e = abstractC13010e;
        this.f36382e = new C16911e(interfaceC5334e, c11980e, 5);
    }

    public C18540e(C10350e c10350e) {
        this.f36384e = 28;
        this.f36383e = c10350e;
        C17866e c17866e = AbstractC8809e.ad;
        this.f36382e = new C17866e();
    }

    public C18540e(C11715e c11715e, SparseArray sparseArray) {
        this.f36384e = 4;
        this.f36383e = c11715e;
        SparseBooleanArray sparseBooleanArray = c11715e.ad;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int vip = c11715e.vip(i);
            C18177e c18177e = (C18177e) sparseArray.get(vip);
            c18177e.getClass();
            sparseArray2.append(vip, c18177e);
        }
        this.f36382e = sparseArray2;
    }

    public C18540e(AbstractC15958e abstractC15958e) {
        this.f36384e = 22;
        this.f36383e = abstractC15958e;
        this.f36382e = new CopyOnWriteArrayList();
    }

    public /* synthetic */ C18540e(Object obj, Object obj2, int i) {
        this.f36384e = i;
        this.f36383e = obj;
        this.f36382e = obj2;
    }

    public /* synthetic */ C18540e(Object obj, Object obj2, boolean z, int i) {
        this.f36384e = i;
        this.f36382e = obj;
        this.f36383e = obj2;
    }

    public C18540e(String str) {
        this.f36384e = 20;
        this.f36382e = null;
        this.f36383e = str;
    }

    public C18540e(Function1 function1) {
        this.f36384e = 11;
        this.f36383e = function1;
        this.f36382e = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C18540e amazon(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            eۨۗ r2 = new eۨۗ     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 13
            r2.<init>(r5, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18540e.amazon(android.content.Context):eۨۗ");
    }

    public static C18540e applovin(C18540e c18540e, InterfaceC0043e interfaceC0043e, C12476e c12476e, int i) {
        if ((i & 1) != 0) {
            interfaceC0043e = (InterfaceC0043e) c18540e.f36383e;
        }
        if ((i & 2) != 0) {
            c12476e = (C12476e) c18540e.f36382e;
        }
        return new C18540e(interfaceC0043e, c12476e, 3);
    }

    /* renamed from: default, reason: not valid java name */
    public static C18540e m4564default() {
        if (f36379e == null) {
            synchronized (C18540e.class) {
                try {
                    if (f36379e == null) {
                        f36379e = new C18540e(0);
                    }
                } finally {
                }
            }
        }
        return f36379e;
    }

    /* renamed from: implements, reason: not valid java name */
    public static int m4565implements(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static C0560e tapsense(Context context, Intent intent, boolean z) {
        ServiceConnectionC18505e serviceConnectionC18505e;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f36381e) {
            try {
                if (f36380e == null) {
                    f36380e = new ServiceConnectionC18505e(context);
                }
                serviceConnectionC18505e = f36380e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return serviceConnectionC18505e.vip(intent).billing(new ExecutorC14279e(2), new C12582e(11));
        }
        if (C11106e.m2998while().m3010implements(context)) {
            AbstractC2940e.metrica(context, serviceConnectionC18505e, intent);
        } else {
            serviceConnectionC18505e.vip(intent);
        }
        return AbstractC1749e.appmetrica(-1);
    }

    @Override // defpackage.InterfaceC17564e
    public List Signature(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i, int i2, C10067e c10067e) {
        List remoteconfig = c10067e != null ? remoteconfig(abstractC7919e, abstractC6649e, i, i2, c10067e) : null;
        return remoteconfig == null ? C13664e.f27089e : remoteconfig;
    }

    /* renamed from: abstract, reason: not valid java name */
    public Integer m4566abstract(String str) {
        if (((TreeMap) this.f36382e) == null) {
            synchronized (this) {
                try {
                    if (((TreeMap) this.f36382e) == null) {
                        this.f36382e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                        int length = ((String[]) this.f36383e).length;
                        for (int i = 0; i < length; i++) {
                            String str2 = ((String[]) this.f36383e)[i];
                            if (str2 == null) {
                                str2 = BuildConfig.FLAVOR;
                            }
                            ((TreeMap) this.f36382e).put(str2, Integer.valueOf(i));
                        }
                    }
                } finally {
                }
            }
        }
        return (Integer) ((TreeMap) this.f36382e).get(str);
    }

    @Override // defpackage.InterfaceC10864e
    public void ad(C16580e c16580e) {
        C17866e c17866e = (C17866e) this.f36382e;
        c17866e.ad();
        C5896e c5896e = (C5896e) c16580e.f32530e;
        Object[] objArr = c5896e.vip;
        long[] jArr = c5896e.metrica;
        int i = c5896e.appmetrica;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object vip = ((C10350e) this.f36383e).vip(obj);
            int license = c17866e.license(vip);
            int i3 = license >= 0 ? c17866e.metrica[license] : 0;
            if (i3 == 7) {
                c16580e.remove(obj);
            } else {
                c17866e.billing(i3 + 1, vip);
            }
            i = i2;
        }
    }

    @Override // defpackage.InterfaceC18372e
    public /* bridge */ /* synthetic */ Object adcel(AbstractC7919e abstractC7919e, C17485e c17485e, AbstractC1186e abstractC1186e) {
        return null;
    }

    @Override // defpackage.InterfaceC1325e
    public long admob() {
        return ((Long) ((C0211e) this.f36383e).apply(Long.valueOf(((C6173e) this.f36382e).admob()))).longValue();
    }

    public void ads(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.ads(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.InterfaceC17564e
    public List advert(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i) {
        AbstractC13010e abstractC13010e = (AbstractC13010e) this.f36383e;
        if (abstractC6649e instanceof C9920e) {
            abstractC13010e.getClass();
        } else {
            if (!(abstractC6649e instanceof C17485e)) {
                throw new IllegalStateException(("Unknown message: " + abstractC6649e).toString());
            }
            int m2467class = AbstractC8703e.m2467class(i);
            if (m2467class != 1 && m2467class != 2 && m2467class != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
            }
            abstractC13010e.getClass();
        }
        C13664e c13664e = C13664e.f27089e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c13664e, 10));
        Iterator<E> it = c13664e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, eؙٓۧ, eؖ۟ۘ] */
    @Override // defpackage.InterfaceC2868e
    public InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        AbstractC2413e abstractC2413e;
        AbstractC0362e abstractC0362e = (AbstractC0362e) this.f36383e;
        C4412e c4412e = interfaceC6396e instanceof C4412e ? (C4412e) interfaceC6396e : null;
        int appmetrica = AbstractC12246e.appmetrica(abstractC0362e);
        int i = appmetrica > 250 ? 6 : 5;
        int i2 = 1 << i;
        if (c4412e != null && (abstractC2413e = c4412e.vip) != null && abstractC2413e.license() >= i2) {
            return c4412e;
        }
        int i3 = ((appmetrica + i) - 1) / i;
        int i4 = i + 1;
        AbstractC9932e[] abstractC9932eArr = new AbstractC9932e[i4];
        abstractC9932eArr[0] = (AbstractC9932e) this.f36382e;
        for (int i5 = 1; i5 < i; i5++) {
            abstractC9932eArr[i5] = abstractC9932eArr[i5 - 1].inmobi(i3);
        }
        abstractC9932eArr[i] = abstractC9932eArr[0].tapsense(abstractC9932eArr[1]);
        abstractC0362e.Signature(abstractC9932eArr, 0, i4, null);
        AbstractC9932e[] abstractC9932eArr2 = new AbstractC9932e[i2];
        abstractC9932eArr2[0] = abstractC9932eArr[0];
        for (int i6 = i - 1; i6 >= 0; i6--) {
            AbstractC9932e abstractC9932e = abstractC9932eArr[i6];
            int i7 = 1 << i6;
            for (int i8 = i7; i8 < i2; i8 += i7 << 1) {
                abstractC9932eArr2[i8] = abstractC9932eArr2[i8 - i7].ad(abstractC9932e);
            }
        }
        abstractC0362e.Signature(abstractC9932eArr2, 0, i2, null);
        ?? obj = new Object();
        obj.ad = null;
        obj.vip = null;
        obj.metrica = -1;
        obj.vip = abstractC0362e.vip(abstractC9932eArr2, i2);
        obj.ad = abstractC9932eArr[i];
        obj.metrica = i;
        return obj;
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList billing(C8372e c8372e, InterfaceC11824e interfaceC11824e) {
        Iterable iterable = (List) c8372e.mopub(((AbstractC13010e) this.f36383e).advert);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), interfaceC11824e));
        }
        return arrayList;
    }

    /* renamed from: break, reason: not valid java name */
    public ArrayList m4567break(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f36383e;
        C6096e purchase = C6096e.purchase(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        Cursor billing = workDatabase_Impl.billing(purchase);
        try {
            ArrayList arrayList = new ArrayList(billing.getCount());
            while (billing.moveToNext()) {
                arrayList.add(billing.getString(0));
            }
            return arrayList;
        } finally {
            billing.close();
            purchase.isVip();
        }
    }

    @Override // defpackage.InterfaceC0987e
    public ListenableFuture call() {
        ExecutorC7412e executorC7412e = (ExecutorC7412e) this.f36383e;
        int i = ExecutorC7412e.f15173e;
        if (executorC7412e.compareAndSet(EnumC10346e.f20422e, EnumC10346e.f20419e)) {
            return ((InterfaceC0987e) this.f36382e).call();
        }
        C9845e c9845e = C9845e.f19435e;
        return c9845e != null ? c9845e : new C9845e();
    }

    /* renamed from: case, reason: not valid java name */
    public void m4568case() {
        ((SparseIntArray) this.f36383e).clear();
    }

    /* renamed from: catch */
    public void mo1733catch(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.f36383e;
        C0912e advert = C0912e.advert(absSeekBar.getContext(), attributeSet, f36377e, i);
        Drawable startapp = advert.startapp(0);
        if (startapp != null) {
            if (startapp instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) startapp;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m4580static = m4580static(animationDrawable.getFrame(i2), true);
                    m4580static.setLevel(ModuleDescriptor.MODULE_VERSION);
                    animationDrawable2.addFrame(m4580static, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(ModuleDescriptor.MODULE_VERSION);
                startapp = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(startapp);
        }
        Drawable startapp2 = advert.startapp(1);
        if (startapp2 != null) {
            absSeekBar.setProgressDrawable(m4580static(startapp2, false));
        }
        advert.amazon();
    }

    /* renamed from: class, reason: not valid java name */
    public void m4569class(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4569class(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void crashlytics(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.crashlytics(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public void m4570extends(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4570extends(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: final, reason: not valid java name */
    public void m4571final(AbstractC12364e abstractC12364e) {
        C11106e c11106e = (C11106e) this.f36383e;
        ((ActionMode.Callback) c11106e.f22008e).onDestroyActionMode(c11106e.subs(abstractC12364e));
        LayoutInflaterFactory2C8158e layoutInflaterFactory2C8158e = (LayoutInflaterFactory2C8158e) this.f36382e;
        if (layoutInflaterFactory2C8158e.f16599e != null) {
            layoutInflaterFactory2C8158e.f16563e.getDecorView().removeCallbacks(layoutInflaterFactory2C8158e.f16601e);
        }
        if (layoutInflaterFactory2C8158e.f16589e != null) {
            C14712e c14712e = layoutInflaterFactory2C8158e.f16588e;
            if (c14712e != null) {
                c14712e.vip();
            }
            C14712e vip = AbstractC2016e.vip(layoutInflaterFactory2C8158e.f16589e);
            vip.ad(0.0f);
            layoutInflaterFactory2C8158e.f16588e = vip;
            vip.license(new C4575e(2, this));
        }
        layoutInflaterFactory2C8158e.f16565e = null;
        ViewGroup viewGroup = layoutInflaterFactory2C8158e.f16585e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C8158e.m2384throw();
    }

    public void firebase(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.firebase(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f36383e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    /* renamed from: goto, reason: not valid java name */
    public void m4572goto(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4572goto(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: import, reason: not valid java name */
    public void m4573import(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f36382e;
        cardView.f343e.set(i, i2, i3, i4);
        Rect rect = cardView.f341e;
        CardView.ad(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void inmobi(Object obj, String str) {
        HashMap hashMap = (HashMap) this.f36383e;
        obj.getClass();
        hashMap.put(str, obj);
        ((ArrayList) this.f36382e).remove(str);
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i < ((String[]) this.f36383e).length;
    }

    /* renamed from: interface, reason: not valid java name */
    public void m4574interface(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractC15958e abstractC15958e = (AbstractC15958e) this.f36383e;
        AbstractActivityC1752e abstractActivityC1752e = abstractC15958e.isVip.f6096e;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = abstractC15958e.isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4574interface(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public boolean isPro(int i) {
        return ((C11715e) this.f36383e).ad.get(i);
    }

    @Override // defpackage.InterfaceC10864e
    public boolean isVip(Object obj, Object obj2) {
        C10350e c10350e = (C10350e) this.f36383e;
        return AbstractC7890e.billing(c10350e.vip(obj), c10350e.vip(obj2));
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        C13705e c13705e = (C13705e) obj;
        c13705e.getClass();
        ((InterfaceC13297e) ((C18464e) this.f36382e).f36191e).vip(c13705e);
    }

    @Override // defpackage.InterfaceC3896e
    public C5912e loadAd(C11709e c11709e) {
        C7850e c7850e = (C7850e) this.f36383e;
        C3749e c3749e = (C3749e) this.f36382e;
        C18277e c18277e = c3749e.ad;
        if (c18277e == null) {
            c18277e = null;
        }
        ((C11047e) c18277e.metrica).getClass();
        C6798e purchase = AbstractC12511e.purchase(c7850e, c11709e, C16308e.billing);
        if (purchase == null) {
            return null;
        }
        AbstractC2677e.ad(purchase.ad).equals(c11709e);
        return c3749e.purchase(purchase);
    }

    @Override // defpackage.InterfaceC11660e
    public InterfaceC5372e metrica(InterfaceC7227e interfaceC7227e) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f36382e;
        Class subs = ((InterfaceC18155e) interfaceC7227e).subs();
        Object obj = concurrentHashMap.get(subs);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(subs, (obj = new C16771e((InterfaceC5372e) ((Function1) this.f36383e).invoke(interfaceC7227e))))) != null) {
            obj = putIfAbsent;
        }
        return ((C16771e) obj).ad;
    }

    @Override // defpackage.InterfaceC17564e
    public List mopub(AbstractC7919e abstractC7919e, C17485e c17485e) {
        ((AbstractC13010e) this.f36383e).getClass();
        C13664e c13664e = C13664e.f27089e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c13664e, 10));
        Iterator<E> it = c13664e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    /* renamed from: native, reason: not valid java name */
    public void m4575native(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, Bundle bundle, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4575native(abstractComponentCallbacksC17875e, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: new, reason: not valid java name */
    public void m4576new(Exception exc, boolean z) {
        this.f36382e = null;
        HashSet hashSet = (HashSet) this.f36383e;
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(hashSet);
        hashSet.clear();
        C2171e listIterator = remoteconfig.listIterator(0);
        while (listIterator.hasNext()) {
            C13905e c13905e = (C13905e) listIterator.next();
            c13905e.getClass();
            c13905e.mopub(exc, z ? 1 : 3);
        }
    }

    /* renamed from: package, reason: not valid java name */
    public void m4577package(C13905e c13905e) {
        ((HashSet) this.f36383e).add(c13905e);
        if (((C13905e) this.f36382e) != null) {
            return;
        }
        this.f36382e = c13905e;
        C18053e adcel = c13905e.vip.adcel();
        c13905e.applovin = adcel;
        HandlerC10242e handlerC10242e = c13905e.remoteconfig;
        String str = AbstractC9413e.ad;
        adcel.getClass();
        handlerC10242e.getClass();
        handlerC10242e.obtainMessage(1, new C2696e(C6913e.billing.getAndIncrement(), true, SystemClock.elapsedRealtime(), adcel)).sendToTarget();
    }

    public void premium(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractC15958e abstractC15958e = (AbstractC15958e) this.f36383e;
        AbstractActivityC1752e abstractActivityC1752e = abstractC15958e.isVip.f6096e;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = abstractC15958e.isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.premium(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: private, reason: not valid java name */
    public C0560e m4578private(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f36383e;
        ExecutorC14279e executorC14279e = (ExecutorC14279e) this.f36382e;
        boolean z = AbstractC11765e.metrica() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? AbstractC1749e.metrica(executorC14279e, new CallableC9258e(context, intent, 2)).yandex(executorC14279e, new C14559e(context, intent, z2)) : tapsense(context, intent, z2);
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList pro(C15447e c15447e) {
        Iterable iterable = (List) c15447e.f30528e.mopub(((AbstractC13010e) this.f36383e).metrica);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) c15447e.f16035e));
        }
        return arrayList;
    }

    /* renamed from: protected, reason: not valid java name */
    public byte[] m4579protected(byte[] bArr) {
        C14154e c14154e = (C14154e) this.f36382e;
        C1364e c1364e = (C1364e) this.f36383e;
        int i = c14154e.smaato;
        C11467e c11467e = c14154e.Signature;
        int i2 = c14154e.advert;
        byte[] encoded = c1364e.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] admob = AbstractC12442e.admob(c14154e.startapp, encoded.length, encoded);
        C4285e c4285e = c14154e.vip;
        C14154e c14154e2 = (C14154e) c4285e.yandex;
        C9831e c9831e = new C9831e(c14154e2, 5);
        C9831e c9831e2 = new C9831e(c14154e2, 5);
        short[] sArr = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        C9831e c9831e3 = new C9831e(c14154e2, 4);
        int i3 = 4;
        int i4 = c14154e2.purchase;
        byte[] admob2 = AbstractC12442e.admob(0, i4, bArr);
        C9831e[] c9831eArr = (C9831e[]) c9831e.license;
        int i5 = c9831e.vip;
        if (i4 == i5 * 320) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i6;
                int i9 = 0;
                while (i9 < 64) {
                    int i10 = admob2[i7] & 255;
                    int i11 = i9;
                    int i12 = admob2[i7 + 1] & 255;
                    short s = (short) (((short) (i12 << 8)) | i10);
                    int i13 = i12 >> 2;
                    int i14 = admob2[i7 + 2] & 255;
                    short s2 = (short) (((short) (i14 << 6)) | i13);
                    int i15 = i14 >> 4;
                    int i16 = admob2[i7 + 3] & 255;
                    short s3 = (short) (((short) (i16 << 4)) | i15);
                    short s4 = (short) (((short) ((admob2[i7 + 4] & 255) << 2)) | (i16 >> 6));
                    int i17 = i3;
                    short[] sArr2 = new short[i17];
                    sArr2[0] = s;
                    sArr2[1] = s2;
                    sArr2[2] = s3;
                    sArr2[3] = s4;
                    i7 += 5;
                    int i18 = 0;
                    while (i18 < i17) {
                        int i19 = i18;
                        ((short[]) c9831eArr[i8].license)[(i11 * 4) + i18] = (short) ((((sArr2[i19] & 1023) * 3329) + AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) >> 10);
                        i18 = i19 + 1;
                        i17 = 4;
                    }
                    i9 = i11 + 1;
                    i3 = 4;
                }
                i6 = i8 + 1;
                i3 = 4;
            }
        } else {
            int i20 = 8;
            if (i4 != i5 * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            int i21 = 0;
            int i22 = 0;
            while (i21 < i5) {
                int i23 = i21;
                int i24 = i5;
                int i25 = 0;
                while (i25 < 32) {
                    int i26 = admob2[i22] & 255;
                    int i27 = i25;
                    int i28 = admob2[i22 + 1] & 255;
                    short s5 = (short) (i26 | (((short) i28) << 8));
                    int i29 = i28 >> 3;
                    int i30 = admob2[i22 + 2] & 255;
                    short s6 = (short) (i29 | (((short) i30) << 5));
                    int i31 = (i30 >> 6) | (((short) (admob2[i22 + 3] & 255)) << 2);
                    int i32 = admob2[i22 + 4] & 255;
                    short s7 = (short) (i31 | ((short) (i32 << 10)));
                    int i33 = i32 >> 1;
                    int i34 = admob2[i22 + 5] & 255;
                    short s8 = (short) (i33 | (((short) i34) << 7));
                    int i35 = i34 >> 4;
                    int i36 = admob2[i22 + 6] & 255;
                    short s9 = (short) (i35 | (((short) i36) << 4));
                    int i37 = (i36 >> 7) | (((short) (admob2[i22 + 7] & 255)) << 1);
                    int i38 = admob2[i22 + 8] & 255;
                    short s10 = (short) (i37 | ((short) (i38 << 9)));
                    int i39 = i38 >> 2;
                    int i40 = admob2[i22 + 9] & 255;
                    short s11 = (short) (i39 | (((short) i40) << 6));
                    short s12 = (short) ((i40 >> 5) | (((short) (admob2[i22 + 10] & 255)) << 3));
                    short[] sArr3 = new short[i20];
                    sArr3[0] = s5;
                    sArr3[1] = s6;
                    sArr3[2] = s7;
                    sArr3[3] = s8;
                    sArr3[4] = s9;
                    sArr3[5] = s10;
                    sArr3[6] = s11;
                    sArr3[7] = s12;
                    i22 += 11;
                    int i41 = 0;
                    while (i41 < 8) {
                        int i42 = i41;
                        ((short[]) c9831eArr[i23].license)[(i27 * 8) + i41] = (short) ((((sArr3[i42] & 2047) * 3329) + 1024) >> 11);
                        i41 = i42 + 1;
                    }
                    i25 = i27 + 1;
                    i20 = 8;
                }
                i21 = i23 + 1;
                i5 = i24;
                i20 = 8;
            }
        }
        byte[] admob3 = AbstractC12442e.admob(i4, bArr.length, bArr);
        int i43 = c14154e2.appmetrica;
        if (i43 == 128) {
            int i44 = 0;
            int i45 = 0;
            for (int i46 = 128; i44 < i46; i46 = 128) {
                int i47 = i44 * 2;
                byte b = admob3[i45];
                sArr[i47] = (short) (((((short) (b & 15)) * 3329) + 8) >> 4);
                sArr[i47 + 1] = (short) (((((short) ((b & 255) >> 4)) * 3329) + 8) >> 4);
                i45++;
                i44++;
                admob3 = admob3;
            }
        } else {
            if (i43 != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i48 = 0;
            int i49 = 0;
            while (i48 < 32) {
                int i50 = admob3[i49] & 255;
                byte b2 = (byte) i50;
                int i51 = i48;
                int i52 = admob3[i49 + 1] & 255;
                byte b3 = (byte) ((i50 >> 5) | (i52 << 3));
                byte b4 = (byte) (i52 >> 2);
                int i53 = i52 >> 7;
                int i54 = admob3[i49 + 2] & 255;
                byte b5 = (byte) (i53 | (i54 << 1));
                int i55 = i54 >> 4;
                int i56 = admob3[i49 + 3] & 255;
                byte b6 = (byte) (i55 | (i56 << 4));
                byte b7 = (byte) (i56 >> 1);
                int i57 = i56 >> 6;
                int i58 = admob3[i49 + 4] & 255;
                byte b8 = (byte) (i57 | (i58 << 2));
                byte b9 = (byte) (i58 >> 3);
                int i59 = i49;
                byte[] bArr4 = {b2, b3, b4, b5, b6, b7, b8, b9};
                int i60 = i59 + 5;
                int i61 = 0;
                for (int i62 = 8; i61 < i62; i62 = 8) {
                    sArr[(i51 * 8) + i61] = (short) ((((bArr4[i61] & 31) * 3329) + 16) >> 5);
                    i61++;
                }
                i48 = i51 + 1;
                i49 = i60;
            }
        }
        c9831e2.firebase(encoded);
        c9831e.m2714transient();
        C9831e.m2671new(c9831e3, c9831e2, c9831e, c14154e2);
        c9831e3.m2702package();
        for (int i63 = 0; i63 < 256; i63++) {
            short s13 = sArr[i63];
            short[] sArr4 = (short[]) c9831e3.license;
            sArr4[i63] = (short) (s13 - sArr4[i63]);
        }
        c9831e3.m2710synchronized();
        int i64 = 32;
        byte[] bArr5 = new byte[32];
        c9831e3.isVip();
        int i65 = 0;
        while (i65 < i64) {
            bArr5[i65] = 0;
            for (int i66 = 0; i66 < 8; i66++) {
                short s14 = ((short[]) c9831e3.license)[(i65 * 8) + i66];
                bArr5[i65] = (byte) (((byte) ((((s14 - 2497) & (832 - s14)) >>> 31) << i66)) | bArr5[i65]);
            }
            i65++;
            i64 = 32;
        }
        System.arraycopy(bArr5, 0, bArr2, 0, i64);
        System.arraycopy(encoded, i2 - 64, bArr2, i64, i64);
        C9147e c9147e = (C9147e) c11467e.f23070e;
        c9147e.purchase(0, 64, bArr2);
        c9147e.doFinal(bArr3, 0);
        int i67 = i + 32;
        byte[] bArr6 = new byte[i67];
        System.arraycopy(encoded, i2 - 32, bArr6, 0, i64);
        System.arraycopy(bArr, 0, bArr6, i64, i);
        C16253e c16253e = (C16253e) c11467e.f23071e;
        c16253e.purchase(0, i67, bArr6);
        c16253e.metrica(0, i67, bArr6);
        byte[] metrica = c4285e.metrica(admob, AbstractC12442e.admob(0, i64, bArr2), AbstractC12442e.admob(i64, 64, bArr3));
        int length = metrica.length ^ bArr.length;
        for (int i68 = 0; i68 != metrica.length; i68++) {
            length |= bArr[i68] ^ metrica[i68];
        }
        int i69 = (0 - (length & 255)) >> 24;
        for (int i70 = 0; i70 != 32; i70++) {
            bArr3[i70] = (byte) ((bArr6[i70] & i69) | (bArr3[i70] & (~i69)));
        }
        return AbstractC12442e.admob(0, c14154e.loadAd, bArr3);
    }

    @Override // defpackage.InterfaceC17564e
    public ArrayList purchase(C13212e c13212e, InterfaceC11824e interfaceC11824e) {
        Iterable iterable = (List) c13212e.mopub(((AbstractC13010e) this.f36383e).mopub);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), interfaceC11824e));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17564e
    public List remoteconfig(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i, int i2, C10067e c10067e) {
        Iterable iterable = (List) c10067e.mopub(((AbstractC13010e) this.f36383e).adcel);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17564e
    public List signatures(AbstractC7919e abstractC7919e, AbstractC6649e abstractC6649e, int i) {
        List list;
        AbstractC13010e abstractC13010e = (AbstractC13010e) this.f36383e;
        if (abstractC6649e instanceof C11505e) {
            list = (List) ((C11505e) abstractC6649e).mopub(abstractC13010e.vip);
        } else if (abstractC6649e instanceof C9920e) {
            list = (List) ((C9920e) abstractC6649e).mopub(abstractC13010e.license);
        } else {
            if (!(abstractC6649e instanceof C17485e)) {
                throw new IllegalStateException(("Unknown message: " + abstractC6649e).toString());
            }
            int m2467class = AbstractC8703e.m2467class(i);
            if (m2467class == 1) {
                list = (List) ((C17485e) abstractC6649e).mopub(abstractC13010e.appmetrica);
            } else if (m2467class == 2) {
                list = (List) ((C17485e) abstractC6649e).mopub(abstractC13010e.purchase);
            } else {
                if (m2467class != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((C17485e) abstractC6649e).mopub(abstractC13010e.billing);
            }
        }
        if (list == null) {
            list = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17564e
    public List smaato(AbstractC7919e abstractC7919e, C17485e c17485e) {
        ((AbstractC13010e) this.f36383e).getClass();
        C13664e c13664e = C13664e.f27089e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c13664e, 10));
        Iterator<E> it = c13664e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1325e
    public long startapp() {
        return ((Long) ((C0211e) this.f36383e).apply(Long.valueOf(((C6173e) this.f36382e).startapp()))).longValue();
    }

    /* renamed from: static, reason: not valid java name */
    public Drawable m4580static(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f36382e) == null) {
                this.f36382e = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m4580static(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public Unit m4581strictfp(String str, CameraDevice.StateCallback stateCallback) {
        C17280e c17280e = (C17280e) this.f36382e;
        CameraManager cameraManager = (CameraManager) ((InterfaceC16964e) this.f36383e).get();
        try {
            Trace.beginSection(((Object) C5060e.vip(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC17305e.m4282extends(cameraManager, str, (Executor) c17280e.yandex.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, c17280e.ad());
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void subs(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.subs(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.InterfaceC18372e
    public Object subscription(AbstractC7919e abstractC7919e, C17485e c17485e, AbstractC1186e abstractC1186e) {
        C3545e c3545e = (C3545e) AbstractC0863e.appmetrica(c17485e, ((AbstractC13010e) this.f36383e).startapp);
        if (c3545e == null) {
            return null;
        }
        return ((C16911e) this.f36382e).m4218native(abstractC1186e, c3545e, (InterfaceC11824e) abstractC7919e.f16035e);
    }

    /* renamed from: super, reason: not valid java name */
    public boolean m4582super(AbstractC12364e abstractC12364e, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C8158e) this.f36382e).f16585e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        viewGroup.requestApplyInsets();
        C11106e c11106e = (C11106e) this.f36383e;
        ActionMode.Callback callback = (ActionMode.Callback) c11106e.f22008e;
        C3817e subs = c11106e.subs(abstractC12364e);
        C17519e c17519e = (C17519e) c11106e.f22006e;
        Menu menu2 = (Menu) c17519e.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC15372e((Context) c11106e.f22007e, (MenuC8939e) menu);
            c17519e.put(menu, menu2);
        }
        return callback.onPrepareActionMode(subs, menu2);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m4583synchronized(int i, C9831e c9831e) {
        Iterator it = (Iterator) this.f36383e;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f36382e;
            if (entry == null || ((C1808e) entry.getKey()).f4883e >= i) {
                return;
            }
            C1808e c1808e = (C1808e) ((Map.Entry) this.f36382e).getKey();
            Object value = ((Map.Entry) this.f36382e).getValue();
            C5152e c5152e = C5152e.metrica;
            EnumC0337e enumC0337e = c1808e.f4882e;
            int i2 = c1808e.f4883e;
            if (c1808e.f4881e) {
                for (Object obj : (List) value) {
                    if (enumC0337e == EnumC0337e.f2361e) {
                        c9831e.m2691e(i2, 3);
                        ((AbstractC6649e) obj).purchase(c9831e);
                        c9831e.m2691e(i2, 4);
                    } else {
                        c9831e.m2691e(i2, enumC0337e.f2367e);
                        C5152e.mopub(c9831e, enumC0337e, obj);
                    }
                }
            } else if (enumC0337e == EnumC0337e.f2361e) {
                c9831e.m2691e(i2, 3);
                ((AbstractC6649e) value).purchase(c9831e);
                c9831e.m2691e(i2, 4);
            } else {
                c9831e.m2691e(i2, enumC0337e.f2367e);
                C5152e.mopub(c9831e, enumC0337e, value);
            }
            if (it.hasNext()) {
                this.f36382e = (Map.Entry) it.next();
            } else {
                this.f36382e = null;
            }
        }
    }

    /* renamed from: this, reason: not valid java name */
    public void m4584this(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4584this(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m4585throw(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4585throw(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f36384e) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((InterfaceC0987e) this.f36382e).toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m4586transient() {
        try {
            ((FileLock) this.f36382e).release();
            ((FileChannel) this.f36383e).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m4587try(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4587try(abstractComponentCallbacksC17875e, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.InterfaceC17564e
    public List vip(AbstractC7919e abstractC7919e, C13754e c13754e) {
        Iterable iterable = (List) c13754e.mopub(((AbstractC13010e) this.f36383e).yandex);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C16911e) this.f36382e).subscription((C4599e) it.next(), (InterfaceC11824e) abstractC7919e.f16035e));
        }
        return arrayList;
    }

    /* renamed from: while, reason: not valid java name */
    public void m4588while(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, View view, boolean z) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e2 = ((AbstractC15958e) this.f36383e).isPro;
        if (abstractComponentCallbacksC17875e2 != null) {
            abstractComponentCallbacksC17875e2.mopub().loadAd.m4588while(abstractComponentCallbacksC17875e, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f36382e).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        int i = ((C4753e) this.f36383e).purchase;
        if (i == 2 && (th instanceof CancellationException)) {
            AbstractC9464e.yandex("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            return;
        }
        AbstractC9464e.pro("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC16982e.metrica(i), th);
    }
}
