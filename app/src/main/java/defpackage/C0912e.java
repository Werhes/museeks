package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.TypedValue;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912e implements InterfaceC15269e, InterfaceC12765e, InterfaceC17847e, InterfaceC5000e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static C0912e f3330e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f3331e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f3332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f3333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3334e;

    public C0912e() {
        this.f3334e = 5;
        this.f3331e = new AtomicReference(AbstractC8461e.yandex);
        this.f3332e = new Object();
    }

    public /* synthetic */ C0912e(int i) {
        this.f3334e = i;
    }

    public C0912e(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f3334e = 1;
        byte[] bArr2 = new byte[i];
        this.f3332e = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f3331e = new C11883e[i2];
        int i7 = i;
        for (int i8 = 0; i8 != i2; i8++) {
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArr, i7, bArr3, 0, i);
            i7 += i;
            byte[][] bArr4 = new byte[i3];
            for (int i9 = 0; i9 != i3; i9++) {
                byte[] bArr5 = new byte[i];
                bArr4[i9] = bArr5;
                System.arraycopy(bArr, i7, bArr5, 0, i);
                i7 += i;
            }
            ((C11883e[]) this.f3331e)[i8] = new C11883e(bArr3, bArr4, false, 13);
        }
        this.f3333e = new C10312e[i4];
        for (int i10 = 0; i10 != i4; i10++) {
            int i11 = i6 * i;
            byte[] bArr6 = new byte[i11];
            System.arraycopy(bArr, i7, bArr6, 0, i11);
            i7 += i11;
            byte[][] bArr7 = new byte[i5];
            for (int i12 = 0; i12 != i5; i12++) {
                byte[] bArr8 = new byte[i];
                bArr7[i12] = bArr8;
                System.arraycopy(bArr, i7, bArr8, 0, i);
                i7 += i;
            }
            ((C10312e[]) this.f3333e)[i10] = new C10312e(bArr6, bArr7, 16);
        }
        if (i7 != bArr.length) {
            throw new IllegalArgumentException("signature wrong length");
        }
    }

    public /* synthetic */ C0912e(int i, Object obj, Object obj2, Object obj3) {
        this.f3334e = i;
        this.f3332e = obj;
        this.f3331e = obj2;
        this.f3333e = obj3;
    }

    public C0912e(Context context) {
        this.f3334e = 0;
        this.f3332e = new Object();
        this.f3333e = new HashMap();
        this.f3331e = new C12613e(this, context);
    }

    public C0912e(Context context, TypedArray typedArray) {
        this.f3334e = 7;
        this.f3332e = context;
        this.f3331e = typedArray;
    }

    public C0912e(Context context, LocationManager locationManager) {
        this.f3334e = 8;
        this.f3333e = new Object();
        this.f3332e = context;
        this.f3331e = locationManager;
    }

    public C0912e(C5710e c5710e) {
        this.f3334e = 14;
        this.f3333e = c5710e;
        this.f3331e = new AtomicLong((AbstractC5942e.vip.nextLong() & 65535) * 10000);
    }

    public C0912e(final AbstractC7244e abstractC7244e, final String str) {
        this.f3334e = 18;
        this.f3332e = C16299e.license;
        final int i = 1;
        this.f3331e = AbstractC5209e.billing(new InterfaceC6823e(this) { // from class: eًَُ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C0912e f20161e;

            {
                this.f20161e = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:12:0x006d. Please report as an issue. */
            @Override // defpackage.InterfaceC6823e
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                char c2;
                long j4;
                char c3;
                long j5;
                char c4;
                long j6;
                long j7;
                char c5;
                char c6;
                int i2 = i;
                Serializable serializable = abstractC7244e;
                C0912e c0912e = this.f20161e;
                switch (i2) {
                    case 0:
                        int i3 = AbstractC5478e.ad;
                        int i4 = C6729e.f13910e;
                        C10551e metrica = new C10551e().metrica(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = metrica.ad;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            metrica.ad();
                        }
                        C10551e metrica2 = metrica.metrica(BuildConfig.FLAVOR.getBytes());
                        metrica2.ad();
                        ByteBuffer byteBuffer2 = metrica2.ad;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            metrica2.purchase = byteBuffer2.remaining() + metrica2.purchase;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    c2 = 24;
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    c3 = ' ';
                                    c2 = 24;
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    c4 = 24;
                                    c3 = ' ';
                                    j6 = 0;
                                    c = '\b';
                                    c2 = c4;
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    c4 = 24;
                                    c3 = ' ';
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    c2 = c4;
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    c5 = 24;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j9 = metrica2.license;
                        long j10 = metrica2.purchase;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ metrica2.appmetrica;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = (j18 >>> 33) ^ j18;
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        metrica2.license = j20;
                        metrica2.appmetrica = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(metrica2.license).putLong(metrica2.appmetrica).array();
                        char[] cArr = AbstractC17809e.f34896e;
                        new C18330e(array);
                        return ((C16792e) c0912e.f3332e).ad((byte[]) array.clone());
                    default:
                        return ((C16792e) c0912e.f3332e).ad(((AbstractC7244e) serializable).admob());
                }
            }
        });
        final int i2 = 0;
        this.f3333e = AbstractC5209e.billing(new InterfaceC6823e(this) { // from class: eًَُ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C0912e f20161e;

            {
                this.f20161e = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:12:0x006d. Please report as an issue. */
            @Override // defpackage.InterfaceC6823e
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                char c2;
                long j4;
                char c3;
                long j5;
                char c4;
                long j6;
                long j7;
                char c5;
                char c6;
                int i22 = i2;
                Serializable serializable = str;
                C0912e c0912e = this.f20161e;
                switch (i22) {
                    case 0:
                        int i3 = AbstractC5478e.ad;
                        int i4 = C6729e.f13910e;
                        C10551e metrica = new C10551e().metrica(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = metrica.ad;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            metrica.ad();
                        }
                        C10551e metrica2 = metrica.metrica(BuildConfig.FLAVOR.getBytes());
                        metrica2.ad();
                        ByteBuffer byteBuffer2 = metrica2.ad;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            metrica2.purchase = byteBuffer2.remaining() + metrica2.purchase;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c = '\b';
                                    c2 = 24;
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c = '\b';
                                    c3 = ' ';
                                    c2 = 24;
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    c4 = 24;
                                    c3 = ' ';
                                    j6 = 0;
                                    c = '\b';
                                    c2 = c4;
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    c4 = 24;
                                    c3 = ' ';
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    c2 = c4;
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << c3);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << c2);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    c5 = 24;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    c5 = 24;
                                    c6 = ' ';
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << c6;
                                    j8 ^= (byteBuffer2.get(11) & 255) << c5;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    metrica2.license = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ metrica2.license;
                                    metrica2.appmetrica ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j9 = metrica2.license;
                        long j10 = metrica2.purchase;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ metrica2.appmetrica;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = (j18 >>> 33) ^ j18;
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        metrica2.license = j20;
                        metrica2.appmetrica = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(metrica2.license).putLong(metrica2.appmetrica).array();
                        char[] cArr = AbstractC17809e.f34896e;
                        new C18330e(array);
                        return ((C16792e) c0912e.f3332e).ad((byte[]) array.clone());
                    default:
                        return ((C16792e) c0912e.f3332e).ad(((AbstractC7244e) serializable).admob());
                }
            }
        });
    }

    public /* synthetic */ C0912e(C8130e c8130e, String str, String str2, C2580e c2580e) {
        this.f3334e = 16;
        this.f3332e = str;
        this.f3331e = str2;
        this.f3333e = c2580e;
    }

    public C0912e(AbstractC11130e abstractC11130e, C14911e c14911e) {
        this.f3334e = 10;
        this.f3332e = abstractC11130e;
        this.f3331e = c14911e;
        this.f3333e = AbstractC14430e.appmetrica(new LinkedHashSet());
    }

    public C0912e(C15398e c15398e, String str, C14153e c14153e) {
        this.f3334e = 19;
        this.f3332e = str;
        this.f3331e = c14153e;
        this.f3333e = c15398e;
    }

    public C0912e(List list) {
        this.f3334e = 3;
        this.f3332e = list;
        this.f3331e = new InterfaceC18147e[list.size()];
        this.f3333e = new C17790e(new C2007e(7, this));
    }

    public C0912e(ExecutorService executorService) {
        this.f3334e = 11;
        this.f3331e = new Handler(Looper.getMainLooper());
        this.f3333e = new ExecutorC3044e(2, this);
        this.f3332e = new ExecutorC8351e(executorService);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC14697e adcel(InterfaceC18321e interfaceC18321e, String str) {
        AbstractC14697e adcel;
        AbstractC14697e abstractC14697e = (AbstractC14697e) interfaceC18321e;
        if (str.equals(abstractC14697e.metrica)) {
            return abstractC14697e;
        }
        for (Object obj : interfaceC18321e.getChildren()) {
            if (obj instanceof AbstractC14697e) {
                AbstractC14697e abstractC14697e2 = (AbstractC14697e) obj;
                if (str.equals(abstractC14697e2.metrica)) {
                    return abstractC14697e2;
                }
                if ((obj instanceof InterfaceC18321e) && (adcel = adcel((InterfaceC18321e) obj, str)) != null) {
                    return adcel;
                }
            }
        }
        return null;
    }

    public static C0912e advert(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0912e(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void Signature(Object obj) {
        long appmetrica = AbstractC15390e.appmetrica();
        if (appmetrica == AbstractC2760e.ad) {
            this.f3333e = obj;
            return;
        }
        synchronized (this.f3332e) {
            C8245e c8245e = (C8245e) ((AtomicReference) this.f3331e).get();
            int ad = c8245e.ad(appmetrica);
            if (ad >= 0) {
                c8245e.metrica[ad] = obj;
            } else {
                ((AtomicReference) this.f3331e).set(c8245e.vip(appmetrica, obj));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        switch (this.f3334e) {
            case 15:
                C8988e c8988e = (C8988e) obj2;
                C4612e c4612e = (C4612e) this.f3332e;
                String str = (String) this.f3331e;
                InterfaceC13524e interfaceC13524e = (InterfaceC13524e) this.f3333e;
                C4379e c4379e = (C4379e) obj;
                AbstractC9528e.mopub("Not active connection", c4612e.f9941class != 1);
                Context context = c4379e.metrica;
                C10988e appmetrica = AbstractC10432e.appmetrica();
                C1091e c1091e = (C1091e) c4379e.loadAd();
                Parcel m4156e = c1091e.m4156e();
                m4156e.writeString(str);
                AbstractC3336e.vip(m4156e, appmetrica);
                c1091e.m4151e(m4156e, 12);
                if (interfaceC13524e != null) {
                    C1091e c1091e2 = (C1091e) c4379e.loadAd();
                    Parcel m4156e2 = c1091e2.m4156e();
                    m4156e2.writeString(str);
                    AbstractC3336e.vip(m4156e2, appmetrica);
                    c1091e2.m4151e(m4156e2, 11);
                }
                c8988e.vip(null);
                return;
            default:
                C7971e c7971e = (C7971e) obj;
                C4627e c4627e = new C4627e((C8988e) obj2);
                String str2 = (String) this.f3332e;
                String str3 = (String) this.f3331e;
                C2580e c2580e = (C2580e) this.f3333e;
                c7971e.getClass();
                BinderC1751e binderC1751e = new BinderC1751e(c2580e);
                c7971e.f16144goto.add(binderC1751e);
                C11125e c11125e = (C11125e) c7971e.loadAd();
                C16207e c16207e = new C16207e();
                c16207e.f31837e = new BinderC11050e(c4627e);
                c16207e.f31835e = str2;
                c16207e.f31826e = str3;
                c16207e.f31838e = binderC1751e;
                Parcel m4156e3 = c11125e.m4156e();
                int i = AbstractC0923e.ad;
                m4156e3.writeInt(1);
                c16207e.writeToParcel(m4156e3, 0);
                c11125e.m4153e(m4156e3, 2005);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_version_id_t] */
    public void ad() {
        Iterator it = ((Iterable) ((C7744e) this.f3333e).ad).iterator();
        while (it.hasNext()) {
            NativePointer nativePointer = (NativePointer) ((C6571e) it.next()).f13544e;
            C14911e c14911e = (C14911e) this.f3331e;
            AbstractC11130e abstractC11130e = (AbstractC11130e) this.f3332e;
            long new_realm_version_id_t = realmcJNI.new_realm_version_id_t();
            ?? obj = new Object();
            obj.vip = true;
            obj.ad = new_realm_version_id_t;
            boolean[] zArr = new boolean[1];
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, obj.ad, obj);
            if (!zArr[0]) {
                throw new IllegalStateException("No VersionId was available. Reading the VersionId requires a valid read transaction.");
            }
            c14911e.metrica(abstractC11130e + " CLOSE-ACTIVE " + new C17621e(realmcJNI.realm_version_id_t_version_get(obj.ad, obj)), new Object[0]);
            long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i2 = AbstractC6026e.ad;
            realmcJNI.realm_close(ptr$cinterop_release2);
        }
    }

    public void admob(C12247e c12247e) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Collection) ((C7744e) this.f3333e).ad);
        ((C14911e) this.f3331e).metrica(((AbstractC11130e) this.f3332e) + " TRACK-VERSION " + AbstractC0054e.subscription(c12247e), new Object[0]);
        linkedHashSet.add(new C6571e(c12247e.f24580e, new WeakReference(c12247e)));
        ((C7744e) this.f3333e).ad = linkedHashSet;
    }

    public void amazon() {
        ((TypedArray) this.f3331e).recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    @Override // defpackage.InterfaceC5000e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appmetrica(java.lang.String r6, int r7, java.lang.Throwable r8, byte[] r9, java.util.Map r10) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f3331e
            eٟٕٓ r6 = (defpackage.C14153e) r6
            long r0 = r6.ad
            java.lang.Object r6 = r5.f3333e
            eؙِٕ r6 = (defpackage.C15398e) r6
            java.lang.Object r10 = r5.f3332e
            java.lang.String r10 = (java.lang.String) r10
            eؚؕٓ r2 = r6.mo2262e()
            r2.mo2250e()
            r6.m3947else()
            r2 = 0
            if (r9 != 0) goto L21
            byte[] r9 = new byte[r2]     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r7 = move-exception
            goto La1
        L21:
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L2a
            r3 = 204(0xcc, float:2.86E-43)
            if (r7 != r3) goto L65
            r7 = r3
        L2a:
            if (r8 != 0) goto L65
            eؒۖ۠ r8 = r6.f30353e     // Catch: java.lang.Throwable -> L1e
            defpackage.C15398e.m3939break(r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r8.m526e(r9)     // Catch: java.lang.Throwable -> L1e
            eٍؙٓ r8 = r6.mo2261e()     // Catch: java.lang.Throwable -> L1e
            eِٔۙ r8 = r8.f27497e     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            r8.metrica(r10, r7, r9)     // Catch: java.lang.Throwable -> L1e
            eٜؖ٘ r7 = r6.f30360e     // Catch: java.lang.Throwable -> L1e
            defpackage.C15398e.m3939break(r7)     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.m1479e()     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L61
            eؒۖ۠ r7 = r6.f30353e     // Catch: java.lang.Throwable -> L1e
            defpackage.C15398e.m3939break(r7)     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.m519e(r10)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L61
            r6.loadAd(r10)     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L61:
            r6.m3966this()     // Catch: java.lang.Throwable -> L1e
            goto L9b
        L65:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L1e
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r9, r4)     // Catch: java.lang.Throwable -> L1e
            int r9 = r3.length()     // Catch: java.lang.Throwable -> L1e
            r4 = 32
            int r9 = java.lang.Math.min(r4, r9)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = r3.substring(r2, r9)     // Catch: java.lang.Throwable -> L1e
            eٍؙٓ r3 = r6.mo2261e()     // Catch: java.lang.Throwable -> L1e
            eِٔۙ r3 = r3.f27494e     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            if (r8 != 0) goto L89
            r8 = r9
        L89:
            r3.license(r4, r10, r7, r8)     // Catch: java.lang.Throwable -> L1e
            eؒۖ۠ r7 = r6.f30353e     // Catch: java.lang.Throwable -> L1e
            defpackage.C15398e.m3939break(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r7.m558e(r8)     // Catch: java.lang.Throwable -> L1e
            r6.m3966this()     // Catch: java.lang.Throwable -> L1e
        L9b:
            r6.f30355e = r2
            r6.m3956native()
            return
        La1:
            r6.f30355e = r2
            r6.m3956native()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0912e.appmetrica(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public C2359e billing() {
        int i;
        float f;
        int i2;
        C5550e c5550e = (C5550e) this.f3332e;
        C17102e c17102e = c5550e.subscription;
        C17102e c17102e2 = c5550e.remoteconfig;
        if (c17102e == null || c17102e.billing() || (i = c17102e.f33459e) == 9 || i == 2 || i == 3) {
            return new C2359e(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float metrica = c17102e.metrica();
        if (c17102e2 == null) {
            C2359e c2359e = ((C5550e) this.f3332e).loadAd;
            f = c2359e != null ? (c2359e.appmetrica * metrica) / c2359e.license : metrica;
        } else {
            if (c17102e2.billing() || (i2 = c17102e2.f33459e) == 9 || i2 == 2 || i2 == 3) {
                return new C2359e(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f = c17102e2.metrica();
        }
        return new C2359e(0.0f, 0.0f, metrica, f);
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        C5916e c5916e = (C5916e) this.f3332e;
        String str = (String) this.f3331e;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f3333e;
        synchronized (c5916e.ad) {
            c5916e.ad.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f3334e) {
            case 4:
                return new C9727e((InterfaceC8850e) ((InterfaceC16964e) this.f3332e).get(), (C16723e) ((InterfaceC16964e) this.f3331e).get(), (InterfaceC8018e) ((InterfaceC18006e) this.f3333e).get());
            default:
                long appmetrica = AbstractC15390e.appmetrica();
                if (appmetrica == AbstractC2760e.ad) {
                    return this.f3333e;
                }
                C8245e c8245e = (C8245e) ((AtomicReference) this.f3331e).get();
                int ad = c8245e.ad(appmetrica);
                if (ad >= 0) {
                    return c8245e.metrica[ad];
                }
                return null;
        }
    }

    public void license(Runnable runnable) {
        ((ExecutorC8351e) this.f3332e).execute(runnable);
    }

    public AbstractC14697e loadAd(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", BuildConfig.FLAVOR).replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        String substring = replace.substring(1);
        HashMap hashMap = (HashMap) this.f3333e;
        if (substring == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(((C5550e) this.f3332e).metrica)) {
            return (C5550e) this.f3332e;
        }
        if (hashMap.containsKey(substring)) {
            return (AbstractC14697e) hashMap.get(substring);
        }
        AbstractC14697e adcel = adcel((C5550e) this.f3332e, substring);
        hashMap.put(substring, adcel);
        return adcel;
    }

    public void metrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        InterfaceC18147e[] interfaceC18147eArr = (InterfaceC18147e[]) this.f3331e;
        for (int i = 0; i < interfaceC18147eArr.length; i++) {
            c18316e.ad();
            c18316e.vip();
            InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 3);
            C16975e c16975e = (C16975e) ((List) this.f3332e).get(i);
            String str = c16975e.loadAd;
            AbstractC2301e.startapp("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = c16975e.ad;
            if (str2 == null) {
                c18316e.vip();
                str2 = c18316e.appmetrica;
            }
            C11445e c11445e = new C11445e();
            c11445e.ad = str2;
            c11445e.smaato = AbstractC8542e.amazon("video/mp2t");
            c11445e.amazon = AbstractC8542e.amazon(str);
            c11445e.appmetrica = c16975e.appmetrica;
            c11445e.license = c16975e.license;
            c11445e.f23019extends = c16975e.f33286throw;
            c11445e.admob = c16975e.subscription;
            AbstractC8647e.firebase(c11445e, Signature);
            interfaceC18147eArr[i] = Signature;
        }
    }

    public Typeface mopub(int i, int i2, C5543e c5543e) {
        int resourceId = ((TypedArray) this.f3331e).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f3333e) == null) {
            this.f3333e = new TypedValue();
        }
        Context context = (Context) this.f3332e;
        TypedValue typedValue = (TypedValue) this.f3333e;
        ThreadLocal threadLocal = AbstractC16340e.ad;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC16340e.metrica(context, resourceId, typedValue, i2, c5543e, true, false);
    }

    public ColorStateList purchase(int i) {
        int resourceId;
        ColorStateList amazon;
        TypedArray typedArray = (TypedArray) this.f3331e;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (amazon = AbstractC10077e.amazon((Context) this.f3332e, resourceId)) == null) ? typedArray.getColorStateList(i) : amazon;
    }

    public void smaato(LongPointerWrapper longPointerWrapper) {
        InterfaceC14666e interfaceC14666e = (InterfaceC14666e) this.f3332e;
        ((AbstractC1984e) this.f3333e).appmetrica(interfaceC14666e.isValid() ? interfaceC14666e.mo660extends(((C0149e) this.f3331e).startapp().m3788e()) : null, longPointerWrapper);
    }

    public Drawable startapp(int i) {
        int resourceId;
        Drawable billing;
        if (!((TypedArray) this.f3331e).hasValue(i) || (resourceId = ((TypedArray) this.f3331e).getResourceId(i, 0)) == 0) {
            return null;
        }
        C17264e ad = C17264e.ad();
        Context context = (Context) this.f3332e;
        synchronized (ad) {
            billing = ad.ad.billing(context, resourceId, true);
        }
        return billing;
    }

    public File subscription() {
        String str = (String) ((InterfaceC6823e) this.f3331e).get();
        String str2 = (String) ((InterfaceC6823e) this.f3333e).get();
        return new File(AbstractC4653e.ads(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_version_id_t] */
    public void vip() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6571e c6571e : (Iterable) ((C7744e) this.f3333e).ad) {
            NativePointer nativePointer = (NativePointer) c6571e.f13544e;
            if (((WeakReference) c6571e.f13543e).get() == null) {
                C14911e c14911e = (C14911e) this.f3331e;
                AbstractC11130e abstractC11130e = (AbstractC11130e) this.f3332e;
                long new_realm_version_id_t = realmcJNI.new_realm_version_id_t();
                ?? obj = new Object();
                obj.vip = true;
                obj.ad = new_realm_version_id_t;
                boolean[] zArr = new boolean[1];
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) nativePointer;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i = AbstractC6026e.ad;
                realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, obj.ad, obj);
                if (!zArr[0]) {
                    throw new IllegalStateException("No VersionId was available. Reading the VersionId requires a valid read transaction.");
                }
                c14911e.metrica(abstractC11130e + " CLOSE-FREED " + realmcJNI.realm_version_id_t_version_get(obj.ad, obj), new Object[0]);
                realmcJNI.realm_close(longPointerWrapper.getPtr$cinterop_release());
            } else {
                linkedHashSet.add(c6571e);
            }
        }
        ((C7744e) this.f3333e).ad = linkedHashSet;
    }

    public Drawable yandex(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3331e;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC4628e.purchase((Context) this.f3332e, resourceId);
    }
}
