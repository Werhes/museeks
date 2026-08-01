package defpackage;

import android.R;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.platform.ComposeView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11467e implements InterfaceC14610e, InterfaceC15269e, InterfaceC10283e, InterfaceC17717e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String[] f23068e = {"id", "key", "metadata"};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f23069e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f23070e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f23071e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f23072e;

    public C11467e(int i) {
        switch (i) {
            case 9:
                this.f23072e = new int[10];
                this.f23070e = new int[10];
                this.f23069e = new int[10];
                this.f23071e = new int[10];
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f23072e = new C16253e(128);
                this.f23071e = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                this.f23069e = new C9147e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                this.f23070e = new C9147e(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
                return;
            default:
                this.f23072e = AbstractC17331e.vip();
                this.f23070e = AbstractC14533e.startapp(null);
                long j = C3618e.appmetrica;
                this.f23069e = AbstractC14533e.startapp(new C3618e(j));
                this.f23071e = AbstractC14533e.startapp(new C3618e(j));
                return;
        }
    }

    public C11467e(View view, Function1 function1) {
        this.f23072e = view;
        this.f23070e = function1;
        ArrayList arrayList = new ArrayList();
        function1.invoke(new C14501e(arrayList, this));
        this.f23069e = arrayList;
    }

    public C11467e(C1410e c1410e, C3168e c3168e, C5891e c5891e, C11883e c11883e) {
        Object obj;
        if (c1410e != null) {
            obj = AbstractC17475e.remoteconfig(c1410e);
        } else {
            C2171e c2171e = AbstractC17475e.f34223e;
            obj = C1410e.f4222e;
        }
        this.f23072e = obj;
        this.f23070e = c3168e;
        this.f23069e = c5891e;
        this.f23071e = c11883e;
    }

    public C11467e(InterfaceC3454e interfaceC3454e) {
        this(new C13935e(interfaceC3454e));
    }

    public C11467e(C11226e c11226e) {
        if (c11226e == null) {
            throw new NullPointerException("params == null");
        }
        this.f23072e = c11226e;
        int i = c11226e.vip;
        this.f23070e = new C13572e(i, (Ctry) c11226e.appmetrica);
        this.f23069e = new byte[i];
        this.f23071e = new byte[i];
    }

    public C11467e(C11467e c11467e, C7302e c7302e) {
        this.f23069e = new HashMap();
        this.f23071e = new HashMap();
        this.f23072e = c11467e;
        this.f23070e = c7302e;
    }

    public C11467e(InterfaceC13049e interfaceC13049e) {
        this.f23072e = interfaceC13049e;
    }

    public C11467e(ServiceC13230e serviceC13230e) {
        this.f23071e = serviceC13230e;
        this.f23072e = new ArrayList();
    }

    public C11467e(C13719e c13719e) {
        this.f23070e = null;
        this.f23069e = null;
        this.f23071e = null;
        this.f23072e = c13719e;
    }

    public /* synthetic */ C11467e(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f23072e = obj;
        this.f23070e = obj2;
        this.f23069e = obj3;
        this.f23071e = obj4;
    }

    public static void remoteconfig(InterfaceC14587e interfaceC14587e, String str) {
        try {
            String str2 = "ExoPlayerCacheIndex" + str;
            SQLiteDatabase writableDatabase = interfaceC14587e.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC1283e.vip(writableDatabase, 1, str);
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(1:26))(3:38|(1:40)(1:43)|41)|27|(1:29)(2:33|(1:35)(2:36|37))|30))|46|6|7|(0)(0)|27|(0)(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (r12 != r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        if (r12 == r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        r12 = new defpackage.C12763e(r12);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v21, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v27, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eِؒۜ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C11467e r9, android.content.Context r10, defpackage.AbstractC16049e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11467e.vip(eِؒۜ, android.content.Context, eؙٖۛ, eُؑ۠):java.lang.Object");
    }

    /* renamed from: abstract, reason: not valid java name */
    public boolean m3207abstract(String str) {
        if (((HashMap) this.f23069e).containsKey(str)) {
            return true;
        }
        C11467e c11467e = (C11467e) this.f23072e;
        if (c11467e != null) {
            return c11467e.m3207abstract(str);
        }
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public /* synthetic */ boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e adcel(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        if (((AbstractC3424e) this.f23069e) == null) {
            this.f23069e = abstractC3424e3.metrica();
        }
        AbstractC3424e abstractC3424e4 = (AbstractC3424e) this.f23069e;
        if (abstractC3424e4 == null) {
            abstractC3424e4 = null;
        }
        int vip = abstractC3424e4.vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e5 = (AbstractC3424e) this.f23069e;
            if (abstractC3424e5 == null) {
                abstractC3424e5 = null;
            }
            abstractC3424e5.appmetrica(i, ((InterfaceC13049e) this.f23072e).get(i).vip(j, abstractC3424e.ad(i), abstractC3424e2.ad(i), abstractC3424e3.ad(i)));
        }
        AbstractC3424e abstractC3424e6 = (AbstractC3424e) this.f23069e;
        if (abstractC3424e6 == null) {
            return null;
        }
        return abstractC3424e6;
    }

    public byte[] ads(byte[] bArr, C16450e c16450e) {
        C11145e c11145e = new C11145e(1);
        c11145e.metrica = c16450e.ad;
        c11145e.vip = c16450e.vip;
        c11145e.appmetrica = c16450e.appmetrica;
        return ((C13572e) this.f23070e).license(bArr, new C16450e(c11145e).ad());
    }

    @Override // defpackage.InterfaceC14610e
    public void advert(HashMap hashMap) {
        SparseArray sparseArray = (SparseArray) this.f23070e;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((C5455e) this.f23072e).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C15514e c15514e = (C15514e) sparseArray.valueAt(i);
                    if (c15514e == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.f23071e;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        metrica(writableDatabase, c15514e);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.InterfaceC14610e
    public void amazon(HashMap hashMap, SparseArray sparseArray) {
        C5455e c5455e = (C5455e) this.f23072e;
        AbstractC2301e.subscription(((SparseArray) this.f23070e).size() == 0);
        try {
            SQLiteDatabase readableDatabase = c5455e.getReadableDatabase();
            String str = (String) this.f23069e;
            str.getClass();
            if (AbstractC1283e.ad(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c5455e.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    subs(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c5455e.getReadableDatabase();
            String str2 = (String) this.f23071e;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, f23068e, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new C15514e(i, string, C2532e.license(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e);
        }
    }

    public C17974e applovin(C16450e c16450e) {
        C11226e c11226e = (C11226e) this.f23072e;
        byte[][] bArr = new byte[c11226e.license];
        int i = 0;
        while (true) {
            int i2 = c11226e.license;
            if (i >= i2) {
                return new C17974e(c11226e, bArr);
            }
            C11145e c11145e = new C11145e(1);
            c11145e.metrica = c16450e.ad;
            c11145e.vip = c16450e.vip;
            c11145e.appmetrica = c16450e.appmetrica;
            c11145e.purchase = i;
            c11145e.billing = c16450e.billing;
            c11145e.license = c16450e.license;
            c16450e = new C16450e(c11145e);
            if (i < 0 || i >= i2) {
                break;
            }
            bArr[i] = subscription(((C13572e) this.f23070e).license((byte[]) this.f23069e, AbstractC16947e.advert(32, i)), c11226e.metrica - 1, c16450e);
            i++;
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    @Override // defpackage.InterfaceC14610e
    public void appmetrica() {
        C5455e c5455e = (C5455e) this.f23072e;
        String str = (String) this.f23069e;
        str.getClass();
        remoteconfig(c5455e, str);
    }

    @Override // defpackage.InterfaceC14610e
    public void billing(C15514e c15514e, boolean z) {
        int i = c15514e.ad;
        SparseArray sparseArray = (SparseArray) this.f23070e;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* renamed from: break, reason: not valid java name */
    public ArrayList m3208break(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = (ArrayList) this.f23069e;
        if (!arrayList2.isEmpty()) {
            int i = C8810e.f17721e;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            C8810e c8810e = !arrayList3.isEmpty() ? new C8810e(outputStream, arrayList3) : null;
            if (c8810e != null) {
                arrayList.add(c8810e);
            }
        }
        Iterator it2 = ((AbstractC17475e) this.f23070e).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        throw null;
    }

    /* renamed from: case, reason: not valid java name */
    public InterfaceC2268e m3209case(String str) {
        HashMap hashMap = (HashMap) this.f23069e;
        if (hashMap.containsKey(str)) {
            return (InterfaceC2268e) hashMap.get(str);
        }
        C11467e c11467e = (C11467e) this.f23072e;
        if (c11467e != null) {
            return c11467e.m3209case(str);
        }
        throw new IllegalArgumentException(AbstractC10257e.adcel(str, " is not defined"));
    }

    /* renamed from: class, reason: not valid java name */
    public void m3210class(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f23070e = Integer.valueOf(i);
    }

    public void crashlytics() {
        C4363e c4363e = new C4363e(this, (ServiceC13230e) this.f23071e);
        this.f23070e = c4363e;
        c4363e.onCreate();
    }

    /* renamed from: default, reason: not valid java name */
    public void m3211default(String str, InterfaceC2268e interfaceC2268e) {
        C11467e c11467e;
        HashMap hashMap = (HashMap) this.f23069e;
        if (!hashMap.containsKey(str) && (c11467e = (C11467e) this.f23072e) != null && c11467e.m3207abstract(str)) {
            c11467e.m3211default(str, interfaceC2268e);
        } else {
            if (((HashMap) this.f23071e).containsKey(str)) {
                return;
            }
            if (interfaceC2268e == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC2268e);
            }
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public InterfaceC2268e m3212extends(InterfaceC2268e interfaceC2268e) {
        return ((C7302e) this.f23070e).purchase(this, interfaceC2268e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r8.appmetrica(r1) == r6) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:25:0x0062, B:27:0x0068, B:30:0x0074), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:25:0x0062, B:27:0x0068, B:30:0x0074), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v3, types: [eؚؗؔ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eِؒۜ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object firebase(defpackage.AbstractC10731e r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f23070e
            eٌٝؐ r0 = (defpackage.C8823e) r0
            boolean r1 = r8 instanceof defpackage.C5770e
            if (r1 == 0) goto L17
            r1 = r8
            eؘٟٝ r1 = (defpackage.C5770e) r1
            int r2 = r1.f12197e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f12197e = r2
            goto L1c
        L17:
            eؘٟٝ r1 = new eؘٟٝ
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.f12200e
            int r2 = r1.f12197e
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            eؚؗؔ r1 = r1.f12198e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L31
            goto L82
        L31:
            r8 = move-exception
            goto L8d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            int r2 = r1.f12196e
            eؚؗؔ r4 = r1.f12198e
            defpackage.AbstractC2003e.purchase(r8)
            r8 = r4
            goto L62
        L44:
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = r0.mo693e()
            if (r8 == 0) goto L50
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L50:
            java.lang.Object r8 = r7.f23072e
            eٍٖ٘ r8 = (defpackage.C17651e) r8
            r1.f12198e = r8
            r2 = 0
            r1.f12196e = r2
            r1.f12197e = r4
            java.lang.Object r4 = r8.appmetrica(r1)
            if (r4 != r6) goto L62
            goto L80
        L62:
            boolean r4 = r0.mo693e()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L74
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
            eٍٖ٘ r8 = (defpackage.C17651e) r8
            r8.billing(r5)
            return r0
        L70:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto L8d
        L74:
            r1.f12198e = r8     // Catch: java.lang.Throwable -> L70
            r1.f12196e = r2     // Catch: java.lang.Throwable -> L70
            r1.f12197e = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = r7.signatures(r1)     // Catch: java.lang.Throwable -> L70
            if (r1 != r6) goto L81
        L80:
            return r6
        L81:
            r1 = r8
        L82:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            r0.m2175import(r8)     // Catch: java.lang.Throwable -> L31
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            return r8
        L8d:
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11467e.firebase(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C16382e((C14679e) ((C15816e) this.f23072e).f31190e, (C1253e) ((InterfaceC16964e) this.f23070e).get(), (InterfaceC8850e) ((InterfaceC16964e) this.f23069e).get(), (C18447e) ((InterfaceC18006e) this.f23071e).get());
    }

    @Override // defpackage.InterfaceC10283e
    public View getRoot() {
        return (LinearLayout) this.f23072e;
    }

    /* renamed from: goto, reason: not valid java name */
    public void m3213goto() {
        this.f23069e = 16;
    }

    /* renamed from: implements, reason: not valid java name */
    public void m3214implements(String str, InterfaceC2268e interfaceC2268e) {
        HashMap hashMap = (HashMap) this.f23069e;
        if (((HashMap) this.f23071e).containsKey(str)) {
            return;
        }
        if (interfaceC2268e == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC2268e);
        }
    }

    @Override // defpackage.InterfaceC17717e
    public long inmobi(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        int vip = abstractC3424e.vip();
        long j = 0;
        for (int i = 0; i < vip; i++) {
            j = Math.max(j, ((InterfaceC13049e) this.f23072e).get(i).metrica(abstractC3424e.ad(i), abstractC3424e2.ad(i), abstractC3424e3.ad(i)));
        }
        return j;
    }

    /* renamed from: interface, reason: not valid java name */
    public void m3215interface(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f23072e = Integer.valueOf(i);
    }

    public long isPro() {
        return ((C3618e) ((C0576e) this.f23069e).getValue()).ad;
    }

    public C18287e isVip() {
        C17684e c17684e = ((ServiceC13230e) this.f23071e).f26259e;
        if (c17684e != null) {
            return c17684e.license;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x005c, code lost:
    
        if (r14 == r4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v1, types: [eٖؑۡ, eُۙۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object license(android.graphics.Bitmap r13, defpackage.AbstractC10731e r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11467e.license(android.graphics.Bitmap, eُؑ۠):java.lang.Object");
    }

    public C9622e loadAd() {
        Integer num = (Integer) this.f23072e;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f23070e) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((C3700e) this.f23069e) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((C2942e) this.f23071e) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f23072e));
        }
        Integer num2 = (Integer) this.f23070e;
        int intValue = num2.intValue();
        C3700e c3700e = (C3700e) this.f23069e;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c3700e == C3700e.vip) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c3700e == C3700e.metrica) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c3700e == C3700e.license) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c3700e == C3700e.appmetrica) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c3700e != C3700e.purchase) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C9622e(((Integer) this.f23072e).intValue(), ((Integer) this.f23070e).intValue(), (C2942e) this.f23071e, (C3700e) this.f23069e);
    }

    public void metrica(SQLiteDatabase sQLiteDatabase, C15514e c15514e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2532e.appmetrica(c15514e.appmetrica, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c15514e.ad));
        contentValues.put("key", c15514e.vip);
        contentValues.put("metadata", byteArray);
        String str = (String) this.f23071e;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    @Override // defpackage.InterfaceC14610e
    public boolean mopub() {
        try {
            SQLiteDatabase readableDatabase = ((C5455e) this.f23072e).getReadableDatabase();
            String str = (String) this.f23069e;
            str.getClass();
            return AbstractC1283e.ad(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: native, reason: not valid java name */
    public void m3216native(byte[] bArr, byte b, byte b2) {
        C16253e c16253e = (C16253e) this.f23072e;
        c16253e.reset();
        byte[] bArr2 = new byte[bArr.length + 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = b;
        bArr2[bArr.length + 1] = b2;
        c16253e.purchase(0, bArr.length + 2, bArr2);
    }

    public void premium(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((C11226e) this.f23072e).vip;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f23069e = bArr;
        this.f23071e = bArr2;
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e pro(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        if (((AbstractC3424e) this.f23070e) == null) {
            this.f23070e = abstractC3424e.metrica();
        }
        AbstractC3424e abstractC3424e4 = (AbstractC3424e) this.f23070e;
        if (abstractC3424e4 == null) {
            abstractC3424e4 = null;
        }
        int vip = abstractC3424e4.vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e5 = (AbstractC3424e) this.f23070e;
            if (abstractC3424e5 == null) {
                abstractC3424e5 = null;
            }
            abstractC3424e5.appmetrica(i, ((InterfaceC13049e) this.f23072e).get(i).appmetrica(j, abstractC3424e.ad(i), abstractC3424e2.ad(i), abstractC3424e3.ad(i)));
        }
        AbstractC3424e abstractC3424e6 = (AbstractC3424e) this.f23070e;
        if (abstractC3424e6 == null) {
            return null;
        }
        return abstractC3424e6;
    }

    /* renamed from: protected, reason: not valid java name */
    public C11467e m3217protected() {
        return new C11467e(this, (C7302e) this.f23070e);
    }

    @Override // defpackage.InterfaceC14610e
    public void purchase(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = ((C5455e) this.f23072e).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                subs(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    metrica(writableDatabase, (C15514e) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.f23070e).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signatures(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f23071e
            eؚٖۤ r0 = (defpackage.C7576e) r0
            boolean r1 = r7 instanceof defpackage.C7697e
            if (r1 == 0) goto L17
            r1 = r7
            eًٜؔ r1 = (defpackage.C7697e) r1
            int r2 = r1.f15621e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f15621e = r2
            goto L1c
        L17:
            eًٜؔ r1 = new eًٜؔ
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f15620e
            int r2 = r1.f15621e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.AbstractC2003e.purchase(r7)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.AbstractC2003e.purchase(r7)
            goto L3f
        L39:
            defpackage.AbstractC2003e.purchase(r7)
            r1.f15621e = r4
            r7 = r5
        L3f:
            eؘۢؐ r7 = (defpackage.InterfaceC5979e) r7
            eٌِٞ r2 = r0.yandex()
            eًٖؔ r4 = new eًٖؔ
            r4.<init>(r0, r7, r6, r5)
            r1.f15621e = r3
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r2, r4, r1)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L55
            return r0
        L55:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11467e.signatures(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14610e
    public void smaato(long j) {
        String hexString = Long.toHexString(j);
        this.f23069e = hexString;
        this.f23071e = AbstractC17861e.Signature("ExoPlayerCacheIndex", hexString);
    }

    public C9325e startapp() {
        Integer num = (Integer) this.f23072e;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f23070e) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((C11594e) this.f23071e) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f23069e) != null) {
            return new C9325e(num.intValue(), ((Integer) this.f23070e).intValue(), ((Integer) this.f23069e).intValue(), (C11594e) this.f23071e);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    public void subs(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.f23069e;
        str.getClass();
        AbstractC1283e.metrica(sQLiteDatabase, 1, str);
        String str2 = (String) this.f23071e;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.f23071e) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public byte[] subscription(byte[] bArr, int i, C16450e c16450e) {
        C13572e c13572e = (C13572e) this.f23070e;
        C11226e c11226e = (C11226e) this.f23072e;
        int i2 = c11226e.vip;
        if (bArr.length != i2) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("startHash needs to be ", i2, "bytes"));
        }
        c16450e.ad();
        if (i > c11226e.metrica - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        byte[] subscription = subscription(bArr, i - 1, c16450e);
        C11145e c11145e = new C11145e(1);
        c11145e.metrica = c16450e.ad;
        c11145e.vip = c16450e.vip;
        c11145e.appmetrica = c16450e.appmetrica;
        c11145e.purchase = c16450e.purchase;
        c11145e.billing = i - 1;
        c11145e.license = 0;
        C16450e c16450e2 = new C16450e(c11145e);
        byte[] license = c13572e.license((byte[]) this.f23071e, c16450e2.ad());
        C11145e c11145e2 = new C11145e(1);
        c11145e2.metrica = c16450e2.ad;
        c11145e2.vip = c16450e2.vip;
        c11145e2.appmetrica = c16450e2.appmetrica;
        c11145e2.purchase = c16450e2.purchase;
        c11145e2.billing = c16450e2.billing;
        c11145e2.license = 1;
        byte[] license2 = c13572e.license((byte[]) this.f23071e, new C16450e(c11145e2).ad());
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (subscription[i3] ^ license2[i3]);
        }
        int length = license.length;
        int i4 = c13572e.f26879e;
        if (length != i4) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i4) {
            return c13572e.adcel(license, 0, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    @Override // defpackage.InterfaceC17717e
    public AbstractC3424e tapsense(AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2, AbstractC3424e abstractC3424e3) {
        if (((AbstractC3424e) this.f23071e) == null) {
            this.f23071e = abstractC3424e3.metrica();
        }
        AbstractC3424e abstractC3424e4 = (AbstractC3424e) this.f23071e;
        if (abstractC3424e4 == null) {
            abstractC3424e4 = null;
        }
        int vip = abstractC3424e4.vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e5 = (AbstractC3424e) this.f23071e;
            if (abstractC3424e5 == null) {
                abstractC3424e5 = null;
            }
            abstractC3424e5.appmetrica(i, ((InterfaceC13049e) this.f23072e).get(i).license(abstractC3424e.ad(i), abstractC3424e2.ad(i), abstractC3424e3.ad(i)));
        }
        AbstractC3424e abstractC3424e6 = (AbstractC3424e) this.f23071e;
        if (abstractC3424e6 == null) {
            return null;
        }
        return abstractC3424e6;
    }

    /* renamed from: this, reason: not valid java name */
    public void m3218this() {
        View view = (View) this.f23072e;
        ComposeView composeView = new ComposeView(view.getContext(), null, 6);
        composeView.setViewCompositionStrategy(C10990e.f21757e);
        composeView.setContent(new C2892e(-353687653, true, new C10006e(this, 0)));
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setId(R.id.content);
        AppActivity appActivity = (AppActivity) view.getContext();
        AbstractC0436e.startapp(frameLayout, appActivity);
        AbstractC15428e.appmetrica(frameLayout, appActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(composeView);
        PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
        this.f23071e = popupWindow;
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = (PopupWindow) this.f23071e;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        PopupWindow popupWindow3 = (PopupWindow) this.f23071e;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(view);
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m3219throw(C9492e c9492e, Object obj, C16212e c16212e) {
        C0959e c0959e = (C0959e) ((HashMap) this.f23072e).get(c9492e);
        if (c0959e != null) {
            c0959e.ad(c9492e, obj, c16212e);
        } else {
            ((C0959e) this.f23069e).ad(c9492e, obj, c16212e);
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m3220try(C9492e c9492e, Iterator it, C16212e c16212e) {
        C0611e c0611e = (C0611e) ((HashMap) this.f23070e).get(c9492e);
        if (c0611e != null) {
            c0611e.ad(c9492e, it, c16212e);
            return;
        }
        C0611e c0611e2 = (C0611e) this.f23071e;
        if (c0611e2 != null && !((HashMap) this.f23072e).containsKey(c9492e)) {
            c0611e2.ad(c9492e, it, c16212e);
        } else {
            while (it.hasNext()) {
                m3219throw(c9492e, it.next(), c16212e);
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public InterfaceC2268e m3221while(C5273e c5273e) {
        InterfaceC2268e interfaceC2268e = InterfaceC2268e.f5755e;
        Iterator loadAd = c5273e.loadAd();
        while (loadAd.hasNext()) {
            interfaceC2268e = ((C7302e) this.f23070e).purchase(this, c5273e.admob(((Integer) loadAd.next()).intValue()));
            if (interfaceC2268e instanceof C8466e) {
                break;
            }
        }
        return interfaceC2268e;
    }

    @Override // defpackage.InterfaceC14610e
    public void yandex(C15514e c15514e) {
        ((SparseArray) this.f23070e).put(c15514e.ad, c15514e);
    }
}
