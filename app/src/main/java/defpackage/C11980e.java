package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11980e implements InterfaceC11429e, InterfaceC17357e, InterfaceC8251e, InterfaceC12556e, InterfaceC10283e, InterfaceC7429e, InterfaceC12233e, InterfaceC0987e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C0611e f23945e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C0959e f23946e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static C11980e f23947e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f23948e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f23949e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f23950e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f23951e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23952e;

    static {
        int i = 0;
        f23946e = new C0959e(i);
        f23945e = new C0611e(i);
    }

    public C11980e(int i) {
        this.f23952e = i;
        switch (i) {
            case 6:
                this.f23950e = new LinkedHashMap();
                final int i2 = 0;
                this.f23949e = new C5363e(new Function0(this) { // from class: eِؕۗ

                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                    public final /* synthetic */ C11980e f7468e;

                    {
                        this.f7468e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                List m3577else = AbstractC13480e.m3577else(((LinkedHashMap) this.f7468e.f23950e).entrySet(), new C11021e(17));
                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3577else, 10));
                                Iterator it = m3577else.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((AbstractC1303e) ((InterfaceC3477e) ((Map.Entry) it.next()).getValue()).getValue());
                                }
                                return arrayList;
                            case 1:
                                List list = (List) ((C5363e) this.f7468e.f23949e).getValue();
                                int size = list.size();
                                if (size != 0) {
                                    return size != 1 ? new C3056e(list) : (AbstractC1303e) AbstractC13480e.m3591interface(list);
                                }
                                throw new IllegalStateException("No providers registered. Please provide a dependency or register provider explicitly");
                            default:
                                this.f7468e.getClass();
                                return AbstractC17648e.f34596e;
                        }
                    }
                });
                final int i3 = 1;
                this.f23951e = new C5363e(new Function0(this) { // from class: eِؕۗ

                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                    public final /* synthetic */ C11980e f7468e;

                    {
                        this.f7468e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                List m3577else = AbstractC13480e.m3577else(((LinkedHashMap) this.f7468e.f23950e).entrySet(), new C11021e(17));
                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3577else, 10));
                                Iterator it = m3577else.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((AbstractC1303e) ((InterfaceC3477e) ((Map.Entry) it.next()).getValue()).getValue());
                                }
                                return arrayList;
                            case 1:
                                List list = (List) ((C5363e) this.f7468e.f23949e).getValue();
                                int size = list.size();
                                if (size != 0) {
                                    return size != 1 ? new C3056e(list) : (AbstractC1303e) AbstractC13480e.m3591interface(list);
                                }
                                throw new IllegalStateException("No providers registered. Please provide a dependency or register provider explicitly");
                            default:
                                this.f7468e.getClass();
                                return AbstractC17648e.f34596e;
                        }
                    }
                });
                final int i4 = 2;
                this.f23948e = new C5363e(new Function0(this) { // from class: eِؕۗ

                    /* renamed from: eؘٙؓ, reason: contains not printable characters */
                    public final /* synthetic */ C11980e f7468e;

                    {
                        this.f7468e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                List m3577else = AbstractC13480e.m3577else(((LinkedHashMap) this.f7468e.f23950e).entrySet(), new C11021e(17));
                                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3577else, 10));
                                Iterator it = m3577else.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((AbstractC1303e) ((InterfaceC3477e) ((Map.Entry) it.next()).getValue()).getValue());
                                }
                                return arrayList;
                            case 1:
                                List list = (List) ((C5363e) this.f7468e.f23949e).getValue();
                                int size = list.size();
                                if (size != 0) {
                                    return size != 1 ? new C3056e(list) : (AbstractC1303e) AbstractC13480e.m3591interface(list);
                                }
                                throw new IllegalStateException("No providers registered. Please provide a dependency or register provider explicitly");
                            default:
                                this.f7468e.getClass();
                                return AbstractC17648e.f34596e;
                        }
                    }
                });
                return;
            case 8:
                this.f23949e = new ArrayDeque();
                this.f23951e = new ArrayDeque();
                this.f23948e = new ArrayDeque();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f23950e = new HashMap();
                this.f23949e = new HashMap();
                this.f23951e = new HashMap();
                this.f23948e = new HashMap();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f23950e = new C17519e(0);
                this.f23949e = new SparseArray();
                this.f23951e = new C2692e((Object) null);
                this.f23948e = new C17519e(0);
                return;
            case 23:
                C7302e c7302e = new C7302e();
                this.f23950e = c7302e;
                C11467e c11467e = new C11467e((C11467e) null, c7302e);
                this.f23951e = c11467e;
                this.f23949e = c11467e.m3217protected();
                C7850e c7850e = new C7850e(28);
                this.f23948e = c7850e;
                c11467e.m3211default("require", new C9366e(c7850e));
                ((HashMap) c7850e.f15896e).put("internal.platform", CallableC14883e.metrica);
                c11467e.m3211default("runtime.counter", new C6020e(Double.valueOf(0.0d)));
                return;
            default:
                C0959e c0959e = AbstractC3265e.advert;
                this.f23950e = new HashMap();
                this.f23949e = new HashMap();
                this.f23948e = null;
                this.f23951e = c0959e;
                return;
        }
    }

    public /* synthetic */ C11980e(int i, boolean z) {
        this.f23952e = i;
    }

    public C11980e(Typeface typeface, C6927e c6927e) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f23952e = 13;
        this.f23948e = typeface;
        this.f23950e = c6927e;
        this.f23951e = new C11446e(1024);
        int ad = c6927e.ad(6);
        if (ad != 0) {
            int i5 = ad + c6927e.f8353e;
            i = ((ByteBuffer) c6927e.f8352e).getInt(((ByteBuffer) c6927e.f8352e).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f23949e = new char[i * 2];
        int ad2 = c6927e.ad(6);
        if (ad2 != 0) {
            int i6 = ad2 + c6927e.f8353e;
            i2 = ((ByteBuffer) c6927e.f8352e).getInt(((ByteBuffer) c6927e.f8352e).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C17115e c17115e = new C17115e(this, i7);
            C4751e vip = c17115e.vip();
            int ad3 = vip.ad(4);
            Character.toChars(ad3 != 0 ? ((ByteBuffer) vip.f8352e).getInt(ad3 + vip.f8353e) : 0, (char[]) this.f23949e, i7 * 2);
            C4751e vip2 = c17115e.vip();
            int ad4 = vip2.ad(16);
            if (ad4 != 0) {
                int i8 = ad4 + vip2.f8353e;
                i3 = ((ByteBuffer) vip2.f8352e).getInt(((ByteBuffer) vip2.f8352e).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC4265e.license(i3 > 0, "invalid metadata codepoint length");
            C11446e c11446e = (C11446e) this.f23951e;
            C4751e vip3 = c17115e.vip();
            int ad5 = vip3.ad(16);
            if (ad5 != 0) {
                int i9 = ad5 + vip3.f8353e;
                i4 = ((ByteBuffer) vip3.f8352e).getInt(((ByteBuffer) vip3.f8352e).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c11446e.ad(c17115e, 0, i4 - 1);
        }
    }

    public C11980e(InterfaceC0293e interfaceC0293e) {
        this.f23952e = 10;
        C10398e c10398e = new C10398e(interfaceC0293e);
        this.f23950e = c10398e;
        int i = c10398e.f20548e;
        this.f23951e = new byte[i];
        this.f23949e = new byte[i];
    }

    public C11980e(C2532e c2532e, C0520e c0520e, C14461e c14461e) {
        this.f23952e = 4;
        this.f23949e = c2532e;
        this.f23951e = c0520e;
        this.f23948e = c14461e;
        this.f23950e = new ArrayList();
    }

    public C11980e(InterfaceC2881e interfaceC2881e, InterfaceC13297e interfaceC13297e, String str) {
        this.f23952e = 18;
        this.f23949e = interfaceC2881e;
        this.f23950e = interfaceC13297e;
        this.f23948e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eٍؚؒ, java.lang.Object] */
    public C11980e(C5753e c5753e, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int i;
        C9930e c9930e;
        int i2;
        C8402e c8402e;
        C7988e c7988e;
        int i3;
        int i4;
        C7988e c7988e2;
        this.f23952e = 11;
        AbstractC13062e.metrica();
        this.f23950e = c5753e;
        c5753e.getClass();
        C4589e c4589e = (C4589e) c5753e.smaato(InterfaceC12438e.f24895e, null);
        if (c4589e == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + AbstractC1786e.license(c5753e, c5753e.toString()));
        }
        int i5 = 1;
        C10379e c10379e = new C10379e(1);
        c4589e.ad(c5753e, c10379e);
        c10379e.tapsense();
        ?? obj = new Object();
        this.f23949e = obj;
        Executor executor = (Executor) ((C17015e) c5753e.mopub()).smaato(InterfaceC15153e.f29990throw, AbstractC3062e.smaato());
        Objects.requireNonNull(executor);
        C16722e c16722e = new C16722e(executor, cameraCharacteristics);
        this.f23951e = c16722e;
        ArrayList arrayList = new ArrayList();
        if (((Integer) AbstractC0054e.Signature(c5753e, InterfaceC14405e.applovin, 0)).intValue() != 0) {
            arrayList.add(32);
            arrayList.add(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        } else {
            Integer num = (Integer) ((C17015e) c5753e.mopub()).smaato(C5753e.f12175e, null);
            if (num != null) {
                i = num.intValue();
            } else {
                Integer num2 = (Integer) ((C17015e) c5753e.mopub()).smaato(InterfaceC14405e.isPro, null);
                i = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(i));
        }
        int advert = c5753e.advert();
        if (((C17015e) c5753e.mopub()).smaato(C5753e.f12178e, null) != null) {
            throw new ClassCastException();
        }
        C12631e c12631e = new C12631e();
        C12631e c12631e2 = new C12631e();
        C7281e c7281e = new C7281e(size, advert, arrayList, z, c12631e, c12631e2);
        this.f23948e = c7281e;
        AbstractC4265e.yandex("CaptureNode does not support recreation yet.", ((C7281e) obj.f3321e) == null && ((C4052e) obj.f3323e) == null);
        obj.f3321e = c7281e;
        C11606e c11606e = new C11606e(i5, obj);
        boolean z2 = arrayList.size() > 1;
        if (z) {
            C7988e c7988e3 = new C7988e(17, AbstractC5750e.vip(size.getWidth(), size.getHeight(), advert, 4));
            i2 = 1;
            c9930e = new C9930e(obj, i2);
            c8402e = null;
            c7988e = c7988e3;
        } else {
            if (z2) {
                i3 = 1;
                i4 = 0;
                C8402e c8402e2 = new C8402e(size.getWidth(), size.getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
                AbstractC15143e.metrica(c11606e, c8402e2.f17175e);
                C8402e c8402e3 = new C8402e(size.getWidth(), size.getHeight(), 32, 4);
                AbstractC15143e.metrica(c11606e, c8402e3.f17175e);
                c8402e = c8402e3;
                c7988e2 = c8402e2;
            } else {
                i3 = 1;
                i4 = 0;
                C8402e c8402e4 = new C8402e(size.getWidth(), size.getHeight(), advert, 4);
                AbstractC15143e.metrica(c11606e, c8402e4.f17175e);
                c8402e = null;
                c7988e2 = c8402e4;
            }
            c9930e = new C9930e(obj, i4);
            i2 = i3;
            c7988e = c7988e2;
        }
        Surface surface = c7988e.getSurface();
        Objects.requireNonNull(surface);
        AbstractC4265e.yandex("The surface is already set.", c7281e.ad == null ? i2 : 0);
        c7281e.ad = new C1385e(surface, size, advert);
        obj.f3323e = new C4052e(c7988e);
        int i6 = 8;
        c7988e.pro(new C0211e(i6, obj), AbstractC3062e.amazon());
        if (z2 && c8402e != null) {
            Surface surface2 = c8402e.getSurface();
            AbstractC4265e.yandex("The secondary surface is already set.", c7281e.vip == null ? i2 : 0);
            c7281e.vip = new C1385e(surface2, size, advert);
            obj.f3322e = new C4052e(c8402e);
            c8402e.pro(new C0211e(i6, obj), AbstractC3062e.amazon());
        }
        c12631e.vip = c9930e;
        c12631e2.vip = new C18027e(0, obj);
    }

    public C11980e(C6150e c6150e) {
        this.f23952e = 17;
        this.f23950e = new HashMap(c6150e.ad);
        this.f23949e = new HashMap(c6150e.vip);
        this.f23951e = new HashMap(c6150e.metrica);
        this.f23948e = new HashMap(c6150e.license);
    }

    public C11980e(C6272e c6272e, InterfaceC5334e interfaceC5334e) {
        this.f23952e = 14;
        this.f23950e = c6272e;
        this.f23949e = interfaceC5334e;
        this.f23951e = c6272e.vip(new C16848e(this, 0));
        this.f23948e = c6272e.vip(new C16848e(this, 1));
    }

    public C11980e(C13572e c13572e, C7431e c7431e) {
        this.f23952e = 21;
        this.f23948e = c13572e;
        this.f23950e = new SparseIntArray(1);
        this.f23949e = new SparseIntArray(1);
        this.f23951e = c7431e;
    }

    public C11980e(C17241e c17241e, InterfaceC10383e interfaceC10383e, InterfaceC3477e interfaceC3477e) {
        this.f23952e = 12;
        this.f23950e = c17241e;
        this.f23949e = interfaceC10383e;
        this.f23951e = interfaceC3477e;
        this.f23948e = new C18478e(this, interfaceC10383e);
    }

    public /* synthetic */ C11980e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f23952e = i;
        this.f23950e = obj;
        this.f23949e = obj2;
        this.f23951e = obj3;
        this.f23948e = obj4;
    }

    public C11980e(Socket socket) {
        this.f23952e = 7;
        this.f23950e = socket;
        this.f23949e = new AtomicInteger();
        this.f23951e = new C4330e(this);
        this.f23948e = new C9969e(this);
    }

    /* renamed from: catch, reason: not valid java name */
    public static void m3289catch(C11980e c11980e, RunnableC11790e runnableC11790e, C4602e c4602e, RunnableC11790e runnableC11790e2, int i) {
        C9024e c9024e;
        RunnableC11790e runnableC11790e3;
        if ((i & 1) != 0) {
            runnableC11790e = null;
        }
        if ((i & 2) != 0) {
            c4602e = null;
        }
        if ((i & 4) != 0) {
            runnableC11790e2 = null;
        }
        c11980e.getClass();
        TimeZone timeZone = AbstractC16286e.ad;
        boolean isShutdown = ((ThreadPoolExecutor) c11980e.m3292break()).isShutdown();
        synchronized (c11980e) {
            if (c4602e != null) {
                try {
                    if (!((ArrayDeque) c11980e.f23948e).remove(c4602e)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (runnableC11790e2 != null) {
                runnableC11790e2.f23660e.decrementAndGet();
                if (!((ArrayDeque) c11980e.f23951e).remove(runnableC11790e2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC11790e != null) {
                ((ArrayDeque) c11980e.f23949e).add(runnableC11790e);
                C4602e c4602e2 = runnableC11790e.f23659e;
                if (!c4602e2.f9916e) {
                    String str = c4602e2.f9920e.ad.license;
                    Iterator it = ((ArrayDeque) c11980e.f23951e).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            runnableC11790e3 = (RunnableC11790e) it.next();
                            if (AbstractC7890e.billing(runnableC11790e3.f23659e.f9920e.ad.license, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = ((ArrayDeque) c11980e.f23949e).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    runnableC11790e3 = (RunnableC11790e) it2.next();
                                    if (AbstractC7890e.billing(runnableC11790e3.f23659e.f9920e.ad.license, str)) {
                                        break;
                                    }
                                } else {
                                    runnableC11790e3 = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (runnableC11790e3 != null) {
                        runnableC11790e.f23660e = runnableC11790e3.f23660e;
                    }
                }
            }
            if ((c4602e != null || runnableC11790e2 != null) && (isShutdown || ((ArrayDeque) c11980e.f23951e).isEmpty())) {
                ((ArrayDeque) c11980e.f23948e).isEmpty();
            }
            if (isShutdown) {
                List m3575continue = AbstractC13480e.m3575continue((ArrayDeque) c11980e.f23949e);
                ((ArrayDeque) c11980e.f23949e).clear();
                c9024e = new C9024e(m3575continue);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((ArrayDeque) c11980e.f23949e).iterator();
                while (it3.hasNext()) {
                    RunnableC11790e runnableC11790e4 = (RunnableC11790e) it3.next();
                    if (((ArrayDeque) c11980e.f23951e).size() >= 64) {
                        break;
                    }
                    if (runnableC11790e4.f23660e.get() < 5) {
                        it3.remove();
                        runnableC11790e4.f23660e.incrementAndGet();
                        arrayList.add(runnableC11790e4);
                        ((ArrayDeque) c11980e.f23951e).add(runnableC11790e4);
                    }
                }
                c9024e = new C9024e(arrayList);
            }
        }
        int size = c9024e.ad.size();
        for (int i2 = 0; i2 < size; i2++) {
            RunnableC11790e runnableC11790e5 = (RunnableC11790e) c9024e.ad.get(i2);
            if (runnableC11790e5 != runnableC11790e) {
                C4602e c4602e3 = runnableC11790e5.f23659e;
            }
            if (isShutdown) {
                runnableC11790e5.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                runnableC11790e5.f23659e.adcel(interruptedIOException);
                runnableC11790e5.f23661e.inmobi(interruptedIOException);
            } else {
                ExecutorService m3292break = c11980e.m3292break();
                C4602e c4602e4 = runnableC11790e5.f23659e;
                TimeZone timeZone2 = AbstractC16286e.ad;
                try {
                    try {
                        ((ThreadPoolExecutor) m3292break).execute(runnableC11790e5);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        runnableC11790e5.f23659e.adcel(interruptedIOException2);
                        runnableC11790e5.f23661e.inmobi(interruptedIOException2);
                        c4602e4.f9929e.ad.m3291abstract(runnableC11790e5);
                    }
                } catch (Throwable th2) {
                    c4602e4.f9929e.ad.m3291abstract(runnableC11790e5);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public static synchronized C11980e m3290implements(C0912e c0912e, Context context) {
        C11980e c11980e;
        synchronized (C11980e.class) {
            try {
                if (f23947e == null) {
                    C11980e c11980e2 = new C11980e(0, false);
                    Context applicationContext = context.getApplicationContext();
                    c11980e2.f23950e = new AbstractC9246e(c0912e, applicationContext);
                    c11980e2.f23949e = new AbstractC9246e(c0912e, applicationContext);
                    c11980e2.f23951e = new C9551e(c0912e, applicationContext);
                    c11980e2.f23948e = new AbstractC9246e(c0912e, applicationContext);
                    f23947e = c11980e2;
                }
                c11980e = f23947e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11980e;
    }

    /* renamed from: abstract, reason: not valid java name */
    public void m3291abstract(RunnableC11790e runnableC11790e) {
        m3289catch(this, null, null, runnableC11790e, 3);
    }

    @Override // defpackage.InterfaceC7429e
    public void ad() {
        C13572e c13572e = (C13572e) this.f23948e;
        C7431e c7431e = (C7431e) this.f23951e;
        SparseArray sparseArray = (SparseArray) c13572e.f26878e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((C7431e) sparseArray.valueAt(size)) == c7431e) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC2537e adcel() {
        return (C4330e) this.f23951e;
    }

    @Override // defpackage.InterfaceC8251e
    public boolean amazon() {
        return true;
    }

    @Override // defpackage.InterfaceC7429e
    public int applovin(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f23950e;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey > -1) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        C13572e c13572e = (C13572e) this.f23948e;
        C7431e c7431e = (C7431e) this.f23951e;
        int i2 = c13572e.f26879e;
        c13572e.f26879e = i2 + 1;
        ((SparseArray) c13572e.f26878e).put(i2, c7431e);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.f23949e).put(i2, i);
        return i2;
    }

    @Override // defpackage.InterfaceC8251e
    public BigInteger billing() {
        byte[] bArr = (byte[]) this.f23949e;
        byte[] bArr2 = (byte[]) this.f23951e;
        C10398e c10398e = (C10398e) this.f23950e;
        int billing = AbstractC5907e.billing((BigInteger) this.f23948e);
        byte[] bArr3 = new byte[billing];
        while (true) {
            int i = 0;
            while (i < billing) {
                c10398e.update(bArr2, 0, bArr2.length);
                c10398e.doFinal(bArr2, 0);
                int min = Math.min(billing - i, bArr2.length);
                System.arraycopy(bArr2, 0, bArr3, i, min);
                i += min;
            }
            int i2 = billing * 8;
            int bitLength = ((BigInteger) this.f23948e).bitLength();
            BigInteger bigInteger = AbstractC5907e.ad;
            BigInteger bigInteger2 = new BigInteger(1, bArr3);
            if (i2 > bitLength) {
                bigInteger2 = bigInteger2.shiftRight(i2 - bitLength);
            }
            if (bigInteger2.signum() > 0 && bigInteger2.compareTo((BigInteger) this.f23948e) < 0) {
                return bigInteger2;
            }
            c10398e.update(bArr2, 0, bArr2.length);
            c10398e.update((byte) 0);
            c10398e.doFinal(bArr, 0);
            c10398e.init(new C14915e(bArr));
            c10398e.update(bArr2, 0, bArr2.length);
            c10398e.doFinal(bArr2, 0);
        }
    }

    /* renamed from: break, reason: not valid java name */
    public synchronized ExecutorService m3292break() {
        try {
            if (((ThreadPoolExecutor) this.f23950e) == null) {
                this.f23950e = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC8551e(AbstractC16286e.vip + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ThreadPoolExecutor) this.f23950e;
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        return AbstractC2017e.billing((AbstractC0586e) this.f23949e, AbstractC9855e.vip(new C11561e(1, (C9664e) this.f23950e, (C2111e) this.f23951e, (Executor) this.f23948e)), EnumC3320e.f7489e);
    }

    @Override // defpackage.InterfaceC17357e
    public void cancel() {
        ((Socket) this.f23950e).close();
    }

    /* renamed from: case, reason: not valid java name */
    public Enum m3293case(C10444e c10444e) {
        return (Enum) ((C15937e) ((InterfaceC5072e) this.f23951e)).get(((InterfaceC2102e) ((AbstractC9555e) this.f23949e).appmetrica(((Number) ((C13506e) this.f23950e).get(c10444e)).intValue())).ad());
    }

    @Override // defpackage.InterfaceC12556e
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: default, reason: not valid java name */
    public InterfaceC5052e m3294default(C11709e c11709e, List list) {
        return (InterfaceC5052e) ((C1159e) this.f23948e).invoke(new C8665e(c11709e, list));
    }

    @Override // defpackage.InterfaceC11429e
    /* renamed from: extends */
    public void mo1988extends(C5302e c5302e) {
        ((ArrayList) this.f23950e).add(new C5644e(c5302e));
    }

    /* renamed from: final, reason: not valid java name */
    public void m3295final(C17594e c17594e) {
        c17594e.getClass();
        C10567e c10567e = new C10567e(C12524e.class, c17594e.ad);
        HashMap hashMap = (HashMap) this.f23949e;
        if (!hashMap.containsKey(c10567e)) {
            hashMap.put(c10567e, c17594e);
            return;
        }
        C17594e c17594e2 = (C17594e) hashMap.get(c10567e);
        if (c17594e2.equals(c17594e) && c17594e.equals(c17594e2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c10567e);
    }

    @Override // defpackage.InterfaceC12556e
    public Object firebase(int i, Object obj, int i2, LinkedHashMap linkedHashMap) {
        Object obj2 = get(i);
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f23951e).metrica(c15816e, obj);
        long j = i;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f23948e).getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        realmcJNI.realm_list_set(ptr$cinterop_release, j, metrica.ad, metrica);
        Unit unit = Unit.INSTANCE;
        c15816e.m4020interface();
        return obj2;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C11106e((Executor) ((InterfaceC16964e) this.f23950e).get(), (InterfaceC8685e) ((InterfaceC16964e) this.f23949e).get(), (C12894e) ((C6029e) this.f23951e).get(), (InterfaceC1640e) ((InterfaceC16964e) this.f23948e).get(), 22);
    }

    @Override // defpackage.InterfaceC12556e
    public Object get(int i) {
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f23948e;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC6026e.ad;
        realmcJNI.realm_list_get(ptr$cinterop_release, j, realm_value_tVar.ad, realm_value_tVar);
        return ((AbstractC8441e) this.f23951e).license(realm_value_tVar);
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (FrameLayout) this.f23950e;
    }

    /* renamed from: import, reason: not valid java name */
    public InterfaceC2268e m3296import(C11467e c11467e, C7298e... c7298eArr) {
        InterfaceC2268e interfaceC2268e = InterfaceC2268e.f5755e;
        for (C7298e c7298e : c7298eArr) {
            interfaceC2268e = AbstractC8787e.smaato(c7298e);
            AbstractC8677e.signatures((C11467e) this.f23951e);
            if ((interfaceC2268e instanceof C5094e) || (interfaceC2268e instanceof C1105e)) {
                interfaceC2268e = ((C7302e) this.f23950e).purchase(c11467e, interfaceC2268e);
            }
        }
        return interfaceC2268e;
    }

    @Override // defpackage.InterfaceC12556e
    public int indexOf(Object obj) {
        C15816e c15816e = new C15816e(15);
        AbstractC8441e abstractC8441e = (AbstractC8441e) this.f23951e;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f23948e;
        realm_value_t metrica = abstractC8441e.metrica(c15816e, obj);
        long[] jArr = new long[1];
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_list_find(ptr$cinterop_release, metrica.ad, metrica, jArr, zArr);
        return (int) (zArr[0] ? jArr[0] : -1L);
    }

    @Override // defpackage.InterfaceC12556e
    public boolean inmobi(int i, Collection collection, int i2, Map map) {
        return AbstractC5087e.yandex(this, i, collection, i2, map);
    }

    @Override // defpackage.InterfaceC8251e
    /* renamed from: interface */
    public void mo2393interface(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // defpackage.InterfaceC7429e
    public int isPro(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f23949e;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        StringBuilder premium = AbstractC4653e.premium("requested global type ", i, " does not belong to the adapter:");
        premium.append(((C7431e) this.f23951e).metrica);
        throw new IllegalStateException(premium.toString());
    }

    @Override // defpackage.InterfaceC12556e
    public void isVip(int i, Object obj, int i2, Map map) {
        C15816e c15816e = new C15816e(15);
        realm_value_t metrica = ((AbstractC8441e) this.f23951e).metrica(c15816e, obj);
        long j = i;
        long ptr$cinterop_release = ((LongPointerWrapper) this.f23948e).getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        realmcJNI.realm_list_insert(ptr$cinterop_release, j, metrica.ad, metrica);
        Unit unit = Unit.INSTANCE;
        c15816e.m4020interface();
    }

    @Override // defpackage.InterfaceC11429e
    public InterfaceC15813e license(C11709e c11709e) {
        ArrayList arrayList = new ArrayList();
        C2532e c2532e = (C2532e) this.f23949e;
        return new C11106e(new C14461e(c2532e, AbstractC1284e.purchase((C16113e) c2532e.f6385e, c11709e, (C11980e) c2532e.f6387e), c11709e, arrayList, InterfaceC3054e.f7112e), this, arrayList);
    }

    @Override // defpackage.InterfaceC12556e
    public InterfaceC12556e metrica(InterfaceC15348e interfaceC15348e, LongPointerWrapper longPointerWrapper) {
        return new C11980e((C17974e) this.f23950e, interfaceC15348e, (AbstractC8441e) this.f23951e, longPointerWrapper, 15);
    }

    @Override // defpackage.InterfaceC11429e
    public void mopub() {
        C14461e c14461e = (C14461e) this.f23948e;
        C0520e c0520e = (C0520e) this.f23951e;
        ArrayList arrayList = (ArrayList) this.f23950e;
        if (c0520e == null) {
            c14461e.getClass();
            return;
        }
        C13043e appmetrica = AbstractC8913e.appmetrica(c0520e, (InterfaceC5052e) c14461e.f28588e);
        if (appmetrica != null) {
            ((HashMap) c14461e.f28587e).put(c0520e, new C7270e(AbstractC9386e.license(arrayList), appmetrica.ad()));
            return;
        }
        if (((C2532e) c14461e.f28586e).m934switch((C11709e) c14461e.f28585e) && AbstractC7890e.billing(c0520e.vip(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C16621e) {
                    arrayList2.add(next);
                }
            }
            List list = (List) c14461e.f28591e;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list.add((InterfaceC16566e) ((C16621e) it2.next()).ad);
            }
        }
    }

    /* renamed from: new, reason: not valid java name */
    public void m3297new(C10221e c10221e) {
        c10221e.getClass();
        C10567e c10567e = new C10567e(C17424e.class, c10221e.ad);
        HashMap hashMap = (HashMap) this.f23948e;
        if (!hashMap.containsKey(c10567e)) {
            hashMap.put(c10567e, c10221e);
            return;
        }
        C10221e c10221e2 = (C10221e) hashMap.get(c10567e);
        if (c10221e2.equals(c10221e) && c10221e.equals(c10221e2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c10567e);
    }

    /* renamed from: package, reason: not valid java name */
    public void m3298package(C10444e c10444e, Enum r6) {
        C13506e c13506e = (C13506e) this.f23950e;
        C10861e c10861e = (C10861e) ((ArrayList) this.f23948e).get(r6.ordinal());
        int intValue = ((Number) c13506e.get(c10444e)).intValue();
        int i = (1 << c10861e.vip) - 1;
        int i2 = c10861e.ad;
        c13506e.remoteconfig(c10444e, Integer.valueOf((intValue & (~(i << i2))) + (c10861e.metrica << i2)));
    }

    /* renamed from: private, reason: not valid java name */
    public void m3299private() {
        ((InterfaceC13297e) this.f23950e).release();
        AbstractC13062e.billing(new RunnableC1352e(4, this));
    }

    @Override // defpackage.InterfaceC11429e
    public void pro(Object obj) {
        ArrayList arrayList = (ArrayList) this.f23950e;
        C2532e c2532e = (C2532e) this.f23949e;
        C0520e c0520e = (C0520e) this.f23951e;
        AbstractC13656e adcel = C9616e.adcel((C16113e) c2532e.f6385e, obj);
        if (adcel == null) {
            adcel = new C15873e("Unsupported annotation argument: " + c0520e);
        }
        arrayList.add(adcel);
    }

    /* renamed from: protected, reason: not valid java name */
    public void m3300protected(C4753e c4753e, Map.Entry entry) {
        C4753e c4753e2 = (C4753e) entry.getValue();
        AbstractC9464e.yandex("SurfaceProcessorNode", "     -> outputEdge = " + c4753e2);
        C5453e c5453e = null;
        C5453e c5453e2 = new C5453e(c4753e.billing.ad, ((C4170e) entry.getKey()).license, c4753e.metrica ? (InterfaceC2881e) this.f23949e : null, ((C4170e) entry.getKey()).purchase, ((C4170e) entry.getKey()).billing);
        int i = ((C4170e) entry.getKey()).metrica;
        c4753e2.getClass();
        AbstractC13062e.metrica();
        c4753e2.vip();
        AbstractC4265e.yandex("Consumer can only be linked once.", !c4753e2.adcel);
        c4753e2.adcel = true;
        C16887e c16887e = c4753e2.advert;
        RunnableC3397e remoteconfig = AbstractC15792e.remoteconfig(c16887e.metrica(), new C12886e(c4753e2, c16887e, i, c5453e2, c5453e), AbstractC3062e.amazon());
        remoteconfig.ad(new RunnableC17144e(remoteconfig, new C10312e(this, c4753e2, false, 22), 0), AbstractC3062e.amazon());
    }

    @Override // defpackage.InterfaceC12556e
    public boolean remove(Object obj) {
        return AbstractC5087e.tapsense(this, obj);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public void m3301strictfp(C13507e c13507e) {
        C8764e c8764e = new C8764e(c13507e.ad, C17424e.class);
        HashMap hashMap = (HashMap) this.f23951e;
        if (!hashMap.containsKey(c8764e)) {
            hashMap.put(c8764e, c13507e);
            return;
        }
        C13507e c13507e2 = (C13507e) hashMap.get(c8764e);
        if (c13507e2.equals(c13507e) && c13507e.equals(c13507e2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c8764e);
    }

    @Override // defpackage.InterfaceC17357e
    public InterfaceC0274e subs() {
        return (C9969e) this.f23948e;
    }

    /* renamed from: super, reason: not valid java name */
    public void m3302super(C13780e c13780e) {
        C8764e c8764e = new C8764e(c13780e.ad, C12524e.class);
        HashMap hashMap = (HashMap) this.f23950e;
        if (!hashMap.containsKey(c8764e)) {
            hashMap.put(c8764e, c13780e);
            return;
        }
        C13780e c13780e2 = (C13780e) hashMap.get(c8764e);
        if (c13780e2.equals(c13780e) && c13780e.equals(c13780e2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c8764e);
    }

    @Override // defpackage.InterfaceC11429e
    public void tapsense(C11709e c11709e, C0520e c0520e) {
        ((ArrayList) this.f23950e).add(new C8259e(c11709e, c0520e));
    }

    @Override // defpackage.InterfaceC8251e
    /* renamed from: this */
    public void mo2394this(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f23949e;
        byte[] bArr3 = (byte[]) this.f23951e;
        C10398e c10398e = (C10398e) this.f23950e;
        this.f23948e = bigInteger;
        int length = bArr.length * 8;
        int bitLength = bigInteger.bitLength();
        BigInteger bigInteger3 = AbstractC5907e.ad;
        BigInteger bigInteger4 = new BigInteger(1, bArr);
        if (length > bitLength) {
            bigInteger4 = bigInteger4.shiftRight(length - bitLength);
        }
        if (bigInteger4.compareTo(bigInteger) >= 0) {
            bigInteger4 = bigInteger4.subtract(bigInteger);
        }
        int billing = AbstractC5907e.billing(bigInteger);
        byte[] ad = AbstractC5907e.ad(billing, bigInteger2);
        byte[] ad2 = AbstractC5907e.ad(billing, bigInteger4);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr3, (byte) 1);
        c10398e.init(new C14915e(bArr2));
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.update((byte) 0);
        c10398e.update(ad, 0, ad.length);
        c10398e.update(ad2, 0, ad2.length);
        c10398e.doFinal(bArr2, 0);
        c10398e.init(new C14915e(bArr2, 0, bArr2.length));
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.doFinal(bArr3, 0);
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.update((byte) 1);
        c10398e.update(ad, 0, ad.length);
        c10398e.update(ad2, 0, ad2.length);
        c10398e.doFinal(bArr2, 0);
        c10398e.init(new C14915e(bArr2, 0, bArr2.length));
        c10398e.update(bArr3, 0, bArr3.length);
        c10398e.doFinal(bArr3, 0);
    }

    public String toString() {
        switch (this.f23952e) {
            case 7:
                return ((Socket) this.f23950e).toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public C0679e m3303transient(C12195e c12195e) {
        InterfaceC13297e interfaceC13297e = (InterfaceC13297e) this.f23950e;
        AbstractC13062e.metrica();
        String m1746extends = AbstractC5087e.m1746extends("[", (String) this.f23948e, "] ");
        StringBuilder sb = new StringBuilder();
        sb.append(m1746extends);
        sb.append("SurfaceProcessorNode Transform (Processor=");
        sb.append(interfaceC13297e);
        sb.append("\n   inputEdge = ");
        C4753e c4753e = c12195e.ad;
        List<C4170e> list = c12195e.vip;
        sb.append(c4753e);
        AbstractC9464e.yandex("SurfaceProcessorNode", sb.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC9464e.yandex("SurfaceProcessorNode", "   outputConfig = " + ((C4170e) it.next()));
        }
        this.f23951e = new HashMap();
        for (C4170e c4170e : list) {
            C0679e c0679e = (C0679e) this.f23951e;
            Rect rect = c4170e.license;
            int i = c4170e.purchase;
            boolean z = c4170e.billing;
            Matrix matrix = new Matrix(c4753e.vip);
            RectF rectF = new RectF(rect);
            Size size = c4170e.appmetrica;
            matrix.postConcat(AbstractC8261e.ad(rectF, AbstractC8261e.startapp(size), i, z));
            AbstractC4265e.metrica(AbstractC8261e.license(AbstractC8261e.yandex(i, AbstractC8261e.purchase(rect)), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C10017e vip = c4753e.billing.vip();
            vip.f19786e = size;
            c0679e.put(c4170e, new C4753e(c4170e.vip, c4170e.metrica, vip.ad(), matrix, false, rect2, c4753e.startapp - i, -1, c4753e.appmetrica != z));
        }
        interfaceC13297e.ad(c4753e.license((InterfaceC2881e) this.f23949e, true));
        for (Map.Entry entry : ((C0679e) this.f23951e).entrySet()) {
            m3300protected(c4753e, entry);
            ((C4753e) entry.getValue()).ad(new RunnableC9527e(6, this, c4753e, entry));
        }
        c4753e.loadAd.add(new C18027e(1, (C0679e) this.f23951e));
        return (C0679e) this.f23951e;
    }

    /* renamed from: try, reason: not valid java name */
    public void m3304try() {
        C1385e c1385e;
        AbstractC13062e.metrica();
        C0909e c0909e = (C0909e) this.f23949e;
        c0909e.getClass();
        AbstractC13062e.metrica();
        C7281e c7281e = (C7281e) c0909e.f3321e;
        Objects.requireNonNull(c7281e);
        C4052e c4052e = (C4052e) c0909e.f3323e;
        Objects.requireNonNull(c4052e);
        C4052e c4052e2 = (C4052e) c0909e.f3322e;
        C1385e c1385e2 = c7281e.ad;
        Objects.requireNonNull(c1385e2);
        c1385e2.ad();
        C1385e c1385e3 = c7281e.ad;
        Objects.requireNonNull(c1385e3);
        AbstractC15792e.smaato(c1385e3.appmetrica).ad(new RunnableC11991e(c4052e, 0), AbstractC3062e.amazon());
        C1385e c1385e4 = c7281e.metrica;
        if (c1385e4 != null) {
            c1385e4.ad();
            AbstractC15792e.smaato(c7281e.metrica.appmetrica).ad(new RunnableC11991e(null, 1), AbstractC3062e.amazon());
        }
        if (c7281e.purchase.size() > 1 && (c1385e = c7281e.vip) != null) {
            c1385e.ad();
            AbstractC15792e.smaato(c7281e.vip.appmetrica).ad(new RunnableC11991e(c4052e2, 2), AbstractC3062e.amazon());
        }
        ((C16722e) this.f23951e).getClass();
    }

    @Override // defpackage.InterfaceC12556e
    public NativePointer vip() {
        return (LongPointerWrapper) this.f23948e;
    }

    /* renamed from: while, reason: not valid java name */
    public C0860e m3305while() {
        C17974e c17974e;
        C15768e vip;
        C11897e c11897e = (C11897e) this.f23950e;
        if (c11897e == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        C17974e c17974e2 = (C17974e) this.f23949e;
        if (c17974e2 == null || (c17974e = (C17974e) this.f23951e) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c11897e.ad != ((C15768e) c17974e2.f35233e).ad.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c11897e.vip != ((C15768e) c17974e.f35233e).ad.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (c11897e.ad() && ((Integer) this.f23948e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C11897e) this.f23950e).ad() && ((Integer) this.f23948e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C15400e c15400e = ((C11897e) this.f23950e).appmetrica;
        if (c15400e == C15400e.f30386e) {
            vip = AbstractC16176e.ad;
        } else if (c15400e == C15400e.f30388e) {
            vip = AbstractC16176e.ad(((Integer) this.f23948e).intValue());
        } else {
            if (c15400e != C15400e.f30387e) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((C11897e) this.f23950e).appmetrica);
            }
            vip = AbstractC16176e.vip(((Integer) this.f23948e).intValue());
        }
        return new C0860e((C11897e) this.f23950e, (C17974e) this.f23949e, (C17974e) this.f23951e, vip, (Integer) this.f23948e);
    }

    @Override // defpackage.InterfaceC2750e
    public InterfaceC15348e yandex() {
        return (InterfaceC15348e) this.f23949e;
    }
}
