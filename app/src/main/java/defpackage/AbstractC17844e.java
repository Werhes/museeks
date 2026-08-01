package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17844e extends AbstractC0241e {

    /* renamed from: eؕۚٙ, reason: contains not printable characters */
    public static final byte[] f34950e = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public long f34951e;

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public boolean f34952e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public float f34953e;

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public boolean f34954e;

    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    public boolean f34955e;

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public long f34956e;

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public boolean f34957e;

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public boolean f34958e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C2282e f34959e;

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public boolean f34960e;

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public long f34961e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public int f34962e;

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public int f34963e;

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public boolean f34964e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public int f34965e;

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public boolean f34966e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public float f34967e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public boolean f34968e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C16975e f34969e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public int f34970e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C10629e f34971e;

    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    public boolean f34972e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public C16975e f34973e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public InterfaceC16612e f34974e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public C10643e f34975e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public InterfaceC5827e f34976e;

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public boolean f34977e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final ArrayDeque f34978e;

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public C18520e f34979e;

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public int f34980e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C7507e f34981e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C5646e f34982e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public long f34983e;

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public C5681e f34984e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C7507e f34985e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final boolean f34986e;

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public C11387e f34987e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final AtomicInteger f34988e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public InterfaceC16612e f34989e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final MediaCodec.BufferInfo f34990e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final Context f34991e;

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public int f34992e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public C16975e f34993e;

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public boolean f34994e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public boolean f34995e;

    /* renamed from: eِۜۙ, reason: contains not printable characters */
    public long f34996e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public C1168e f34997e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public boolean f34998e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public boolean f34999e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public boolean f35000e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final float f35001e;

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public ByteBuffer f35002e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public float f35003e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C7507e f35004e;

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public boolean f35005e;

    /* renamed from: eٓۗٞ, reason: contains not printable characters */
    public C18520e f35006e;

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public C16659e f35007e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public boolean f35008e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public C14805e f35009e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public boolean f35010e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public MediaFormat f35011e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final long f35012e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public MediaCrypto f35013e;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public boolean f35014e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final InterfaceC3696e f35015e;

    /* renamed from: e٘ؔؖ, reason: contains not printable characters */
    public AbstractC12614e f35016e;

    /* renamed from: eِ٘, reason: contains not printable characters */
    public boolean f35017e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public ArrayDeque f35018e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public boolean f35019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, eُۥۦ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eؚ۠ۢ, eؘُٕ] */
    public AbstractC17844e(Context context, int i, InterfaceC3696e interfaceC3696e, boolean z, float f) {
        super(i);
        C2282e c2282e = C2282e.f5777e;
        this.f34991e = context.getApplicationContext();
        this.f35015e = interfaceC3696e;
        this.f34959e = c2282e;
        this.f34986e = z;
        this.f35001e = f;
        this.f34988e = new AtomicInteger();
        this.f35004e = new C7507e(0);
        this.f34985e = new C7507e(0);
        this.f34981e = new C7507e(2);
        ?? c7507e = new C7507e(2);
        c7507e.f12034e = 32;
        this.f34982e = c7507e;
        this.f34990e = new MediaCodec.BufferInfo();
        this.f34953e = 1.0f;
        this.f34967e = 1.0f;
        this.f35012e = -9223372036854775807L;
        this.f34978e = new ArrayDeque();
        this.f35007e = C16659e.purchase;
        c7507e.admob(0);
        c7507e.f15296e.order(ByteOrder.nativeOrder());
        C10629e c10629e = new C10629e(0);
        c10629e.f20952e = InterfaceC9018e.ad;
        c10629e.f20950e = 0;
        c10629e.f20951e = 2;
        this.f34971e = c10629e;
        this.f35003e = -1.0f;
        this.f34970e = 0;
        this.f34980e = 0;
        this.f34962e = -1;
        this.f34965e = -1;
        this.f34961e = -9223372036854775807L;
        this.f34956e = -9223372036854775807L;
        this.f34951e = -9223372036854775807L;
        this.f34983e = -9223372036854775807L;
        this.f34963e = 0;
        this.f34992e = 0;
        this.f34987e = new Object();
        this.f34955e = false;
        this.f34996e = 0L;
        int i2 = AbstractC12614e.f25334e;
        this.f35016e = C4477e.f9679e;
        C18520e c18520e = C18520e.vip;
        this.f34979e = c18520e;
        this.f35006e = c18520e;
    }

    /* renamed from: abstract */
    public long mo2717abstract(long j, long j2, boolean z) {
        return super.license(j, j2);
    }

    @Override // defpackage.AbstractC0241e, defpackage.InterfaceC0396e
    public void ad(int i, Object obj) {
        int i2;
        if (i == 11) {
            C14805e c14805e = (C14805e) obj;
            c14805e.getClass();
            this.f35009e = c14805e;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                AbstractC12614e abstractC12614e = (AbstractC12614e) obj;
                if (this.f35016e.equals(abstractC12614e)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(abstractC12614e);
                    HashSet hashSet2 = new HashSet();
                    AbstractC7014e it = this.f35016e.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    InterfaceC5827e interfaceC5827e = this.f34976e;
                    if (interfaceC5827e != null) {
                        if (!hashSet2.isEmpty()) {
                            interfaceC5827e.signatures(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            interfaceC5827e.remoteconfig(new ArrayList(hashSet));
                        }
                    }
                }
                this.f35016e = abstractC12614e;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            C18520e c18520e = (C18520e) obj;
            this.f34979e = c18520e;
            InterfaceC5827e interfaceC5827e2 = this.f34976e;
            if (interfaceC5827e2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c18520e.ad.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                interfaceC5827e2.ad(bundle);
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public void adcel() {
        this.f34969e = null;
        m4453e(C16659e.purchase);
        this.f34978e.clear();
        if (this.f34995e) {
            this.f34995e = false;
            m4447continue();
        } else {
            if (this.f34976e == null) {
                return;
            }
            if (mo4083e()) {
                m4463volatile();
            } else if (mo4075e()) {
                m4461throw();
            } else {
                this.f34955e = true;
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public void ads(float f, float f2) {
        this.f34953e = f;
        this.f34967e = f2;
        m4454e(this.f34973e);
    }

    @Override // defpackage.AbstractC0241e
    public void advert(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.f34978e;
        if (!arrayDeque.isEmpty()) {
            this.f35007e = (C16659e) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.f34952e = false;
            this.f34958e = false;
            this.f35017e = false;
            if (this.f34995e) {
                m4447continue();
            } else if (this.f34976e != null) {
                if (mo4083e()) {
                    m4463volatile();
                    m4459super();
                } else if (mo4075e()) {
                    m4461throw();
                } else {
                    this.f34955e = true;
                }
            }
            if (this.f35007e.license.m2709switch() > 0) {
                this.f34994e = true;
            }
            this.f35007e.license.amazon();
        }
    }

    /* renamed from: break */
    public abstract ArrayList mo2718break(C2282e c2282e, C16975e c16975e, boolean z);

    /* renamed from: case */
    public abstract void mo2719case(C7507e c7507e);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0196  */
    /* renamed from: catch, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4444catch(defpackage.C10643e r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.m4444catch(eَۥؒ, android.media.MediaCrypto):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fd  */
    /* renamed from: class, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4445class(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.m4445class(long, long):boolean");
    }

    /* renamed from: const, reason: not valid java name */
    public final boolean m4446const(int i) {
        C13391e c13391e = this.f1492e;
        c13391e.advert();
        C7507e c7507e = this.f35004e;
        c7507e.amazon();
        int pro = pro(c13391e, c7507e, i | 4);
        if (pro == -5) {
            mo2730instanceof(c13391e);
            return true;
        }
        if (pro != -4 || !c7507e.metrica(4)) {
            return false;
        }
        this.f34952e = true;
        m4462throws();
        return false;
    }

    /* renamed from: continue, reason: not valid java name */
    public final void m4447continue() {
        this.f34956e = -9223372036854775807L;
        m4448default().appmetrica = -9223372036854775807L;
        this.f34951e = -9223372036854775807L;
        this.f34966e = false;
        this.f34982e.amazon();
        this.f34981e.amazon();
        this.f35014e = false;
        C10629e c10629e = this.f34971e;
        c10629e.getClass();
        c10629e.f20952e = InterfaceC9018e.ad;
        c10629e.f20950e = 0;
        c10629e.f20951e = 2;
    }

    /* renamed from: default, reason: not valid java name */
    public final C16659e m4448default() {
        ArrayDeque arrayDeque = this.f34978e;
        return !arrayDeque.isEmpty() ? (C16659e) arrayDeque.getLast() : this.f35007e;
    }

    /* renamed from: else */
    public abstract void mo2720else();

    /* renamed from: extends, reason: not valid java name */
    public final boolean m4449extends() {
        InterfaceC5827e interfaceC5827e = this.f34976e;
        if (interfaceC5827e != null && this.f34963e != 2 && !this.f34952e) {
            int i = this.f34962e;
            C7507e c7507e = this.f34985e;
            if (i < 0) {
                int smaato = interfaceC5827e.smaato();
                this.f34962e = smaato;
                if (smaato >= 0) {
                    c7507e.f15296e = interfaceC5827e.Signature(smaato);
                    c7507e.amazon();
                }
            }
            if (this.f34963e == 1) {
                if (!this.f34999e) {
                    this.f35005e = true;
                    interfaceC5827e.purchase(this.f34962e, 0, 4, 0L);
                    this.f34962e = -1;
                    c7507e.f15296e = null;
                }
                this.f34963e = 2;
                return false;
            }
            if (this.f35008e) {
                this.f35008e = false;
                ByteBuffer byteBuffer = c7507e.f15296e;
                byteBuffer.getClass();
                byteBuffer.put(f34950e);
                interfaceC5827e.purchase(this.f34962e, 38, 0, 0L);
                this.f34962e = -1;
                c7507e.f15296e = null;
                this.f34964e = true;
                return true;
            }
            if (this.f34980e == 1) {
                int i2 = 0;
                while (true) {
                    C16975e c16975e = this.f34973e;
                    c16975e.getClass();
                    if (i2 >= c16975e.subscription.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f34973e.subscription.get(i2);
                    ByteBuffer byteBuffer2 = c7507e.f15296e;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.f34980e = 2;
            }
            ByteBuffer byteBuffer3 = c7507e.f15296e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            C13391e c13391e = this.f1492e;
            c13391e.advert();
            try {
                interfaceC5827e.yandex(new RunnableC7410e(this, c13391e, 4));
                int i3 = this.f34988e.get();
                if (i3 == -3) {
                    if (billing()) {
                        m4448default().appmetrica = this.f34956e;
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.f34980e == 2) {
                            c7507e.amazon();
                            this.f34980e = 1;
                        }
                        mo2730instanceof(c13391e);
                        return true;
                    }
                    if (!c7507e.metrica(4)) {
                        if (this.f34964e || c7507e.metrica(1)) {
                            long j = c7507e.f15301e;
                            if (!mo4077e(c7507e)) {
                                boolean metrica = c7507e.metrica(1073741824);
                                if (metrica) {
                                    C0579e c0579e = c7507e.f15299e;
                                    if (position == 0) {
                                        c0579e.getClass();
                                    } else {
                                        if (c0579e.license == null) {
                                            int[] iArr = new int[1];
                                            c0579e.license = iArr;
                                            c0579e.startapp.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = c0579e.license;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.f34994e) {
                                    C9831e c9831e = m4448default().license;
                                    C16975e c16975e2 = this.f34969e;
                                    c16975e2.getClass();
                                    c9831e.purchase(j, c16975e2);
                                    this.f34994e = false;
                                }
                                this.f34956e = Math.max(this.f34956e, j);
                                if (billing() || c7507e.metrica(536870912)) {
                                    m4448default().appmetrica = this.f34956e;
                                }
                                c7507e.subscription();
                                if (c7507e.metrica(268435456)) {
                                    mo2719case(c7507e);
                                }
                                if (this.f34955e) {
                                    long j2 = this.f34956e;
                                    if (j <= j2) {
                                        this.f34996e = (j2 - j) + 1 + this.f34996e;
                                    }
                                    this.f34956e = j;
                                    this.f34955e = false;
                                }
                                mo4095switch(c7507e);
                                int mo4096try = mo4096try(c7507e);
                                long j3 = j + this.f34996e;
                                if (metrica) {
                                    interfaceC5827e.vip(this.f34962e, c7507e.f15299e, j3, mo4096try);
                                } else {
                                    int i4 = this.f34962e;
                                    ByteBuffer byteBuffer4 = c7507e.f15296e;
                                    byteBuffer4.getClass();
                                    interfaceC5827e.purchase(i4, byteBuffer4.limit(), mo4096try, j3);
                                }
                                this.f34962e = -1;
                                c7507e.f15296e = null;
                                this.f34964e = true;
                                this.f34980e = 0;
                                this.f34987e.metrica++;
                                return true;
                            }
                        } else {
                            c7507e.amazon();
                            if (this.f34980e == 2) {
                                this.f34980e = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    m4448default().appmetrica = this.f34956e;
                    if (this.f34980e == 2) {
                        c7507e.amazon();
                        this.f34980e = 1;
                    }
                    this.f34952e = true;
                    if (!this.f34964e) {
                        m4462throws();
                        return false;
                    }
                    if (!this.f34999e) {
                        this.f35005e = true;
                        interfaceC5827e.purchase(this.f34962e, 0, 4, 0L);
                        this.f34962e = -1;
                        c7507e.f15296e = null;
                        return false;
                    }
                }
            } catch (C5342e e) {
                mo2733private(e);
                m4446const(0);
                m4461throw();
                return true;
            }
        }
        return false;
    }

    /* renamed from: eؑۥؘ */
    public boolean mo4075e() {
        return true;
    }

    /* renamed from: eؒۤۨ */
    public boolean mo4077e(C7507e c7507e) {
        return false;
    }

    /* renamed from: eؘْؖ */
    public boolean mo4078e(C10643e c10643e) {
        return true;
    }

    /* renamed from: eٌؖۡ */
    public boolean mo2722e(C16975e c16975e) {
        return false;
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final void m4450e() {
        InterfaceC16612e interfaceC16612e = this.f34974e;
        interfaceC16612e.getClass();
        InterfaceC12935e billing = interfaceC16612e.billing();
        if (billing instanceof C2848e) {
            try {
                MediaCrypto mediaCrypto = this.f35013e;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C2848e) billing).vip);
            } catch (MediaCryptoException e) {
                throw vip(e, this.f34969e, false, 6006);
            }
        }
        m4452e(this.f34974e);
        this.f34963e = 0;
        this.f34992e = 0;
    }

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final void m4451e(long j) {
        C16975e c16975e = (C16975e) this.f35007e.license.m2703private(j);
        if (c16975e == null && this.f34957e && this.f35011e != null) {
            c16975e = (C16975e) this.f35007e.license.m2707strictfp();
        }
        if (c16975e != null) {
            this.f34993e = c16975e;
        } else if (!this.f34998e || this.f34993e == null) {
            return;
        }
        C16975e c16975e2 = this.f34993e;
        c16975e2.getClass();
        mo2735static(c16975e2, this.f35011e);
        this.f34998e = false;
        this.f34957e = false;
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final void m4452e(InterfaceC16612e interfaceC16612e) {
        InterfaceC16612e interfaceC16612e2 = this.f34989e;
        if (interfaceC16612e2 != interfaceC16612e) {
            if (interfaceC16612e != null) {
                interfaceC16612e.license(null);
            }
            if (interfaceC16612e2 != null) {
                interfaceC16612e2.metrica(null);
            }
        }
        this.f34989e = interfaceC16612e;
    }

    /* renamed from: eُٓؓ */
    public boolean mo4083e() {
        int i = this.f34992e;
        if (i == 3 || ((this.f35010e && !this.f34954e) || (this.f35019e && this.f35005e))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            m4450e();
            return false;
        } catch (C5681e e) {
            AbstractC2803e.amazon("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final void m4453e(C16659e c16659e) {
        this.f35007e = c16659e;
        if (c16659e.metrica != -9223372036854775807L) {
            this.f34957e = true;
            mo2736synchronized();
        }
    }

    /* renamed from: eّٔؖ */
    public abstract int mo2725e(C2282e c2282e, C16975e c16975e);

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final boolean m4454e(C16975e c16975e) {
        if (this.f34976e != null && this.f34992e != 3 && this.f1500e != 0) {
            float f = this.f34967e;
            c16975e.getClass();
            C16975e[] c16975eArr = this.f1493e;
            c16975eArr.getClass();
            float mo2734protected = mo2734protected(f, c16975e, c16975eArr);
            float f2 = this.f35003e;
            if (f2 != mo2734protected) {
                if (mo2734protected == -1.0f) {
                    if (this.f34964e) {
                        this.f34963e = 1;
                        this.f34992e = 3;
                        return false;
                    }
                    m4463volatile();
                    m4459super();
                    return false;
                }
                if (f2 != -1.0f || mo2734protected > this.f35001e) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", mo2734protected);
                    InterfaceC5827e interfaceC5827e = this.f34976e;
                    interfaceC5827e.getClass();
                    interfaceC5827e.ad(bundle);
                    this.f35003e = mo2734protected;
                }
            }
        }
        return true;
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final void m4455e() {
        mo4092public();
        this.f34984e = null;
        this.f35018e = null;
        this.f34975e = null;
        this.f34973e = null;
        this.f35011e = null;
        this.f34998e = false;
        this.f34954e = false;
        this.f35003e = -1.0f;
        this.f34970e = 0;
        this.f35010e = false;
        this.f35019e = false;
        this.f34999e = false;
        this.f34968e = false;
        this.f34960e = false;
        this.f34980e = 0;
    }

    /* renamed from: final, reason: not valid java name */
    public final boolean m4456final(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C16975e c16975e = this.f34993e;
        return c16975e == null || !Objects.equals(c16975e.loadAd, "audio/opus") || j - j2 > 80000;
    }

    /* renamed from: finally */
    public abstract boolean mo2726finally(long j, long j2, InterfaceC5827e interfaceC5827e, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C16975e c16975e);

    public final void firebase(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f34979e.ad.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* renamed from: for */
    public abstract void mo2727for();

    /* renamed from: goto */
    public C6876e mo4091goto(IllegalStateException illegalStateException, C10643e c10643e) {
        return new C6876e(illegalStateException, c10643e);
    }

    /* renamed from: implements */
    public abstract C2532e mo2728implements(C10643e c10643e, C16975e c16975e, MediaCrypto mediaCrypto, float f);

    /* renamed from: import */
    public abstract void mo2729import(String str);

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0157, code lost:
    
        if (m4460this() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0169, code lost:
    
        if (m4460this() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r4.appmetrica(r2) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        if (m4460this() == false) goto L84;
     */
    /* renamed from: instanceof */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C4268e mo2730instanceof(defpackage.C13391e r14) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.mo2730instanceof(eْٝۜ):eَٟؖ");
    }

    /* renamed from: interface */
    public abstract C4268e mo2731interface(C10643e c10643e, C16975e c16975e, C16975e c16975e2);

    @Override // defpackage.AbstractC0241e
    public final long license(long j, long j2) {
        return mo2717abstract(j, j2, this.f34968e);
    }

    /* renamed from: native, reason: not valid java name */
    public final boolean m4457native(long j, long j2) {
        InterfaceC5827e interfaceC5827e = this.f34976e;
        interfaceC5827e.getClass();
        int i = this.f34965e;
        MediaCodec.BufferInfo bufferInfo = this.f34990e;
        if (i < 0) {
            int amazon = interfaceC5827e.amazon(bufferInfo);
            if (amazon < 0) {
                if (amazon != -2) {
                    if (this.f34999e && (this.f34952e || this.f34963e == 2)) {
                        m4462throws();
                    }
                    long j3 = this.f34983e;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.f1505e.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            m4462throws();
                            return false;
                        }
                    }
                    return false;
                }
                this.f34954e = true;
                InterfaceC5827e interfaceC5827e2 = this.f34976e;
                interfaceC5827e2.getClass();
                MediaFormat startapp = interfaceC5827e2.startapp();
                if (this.f34970e != 0 && startapp.getInteger("width") == 32 && startapp.getInteger("height") == 32) {
                    this.f35000e = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.f35016e.isEmpty()) {
                    C18520e c18520e = new C18520e((HashMap) C18520e.ad(startapp, this.f35016e).f31681e);
                    if (!c18520e.equals(this.f35006e)) {
                        this.f35006e = c18520e;
                        mo2737transient(c18520e);
                    }
                }
                this.f35011e = startapp;
                this.f34998e = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.f34996e;
            if (this.f35000e) {
                this.f35000e = false;
                interfaceC5827e.billing(amazon);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m4462throws();
                return false;
            }
            this.f34965e = amazon;
            ByteBuffer subscription = interfaceC5827e.subscription(amazon);
            this.f35002e = subscription;
            if (subscription != null) {
                subscription.position(bufferInfo.offset);
                this.f35002e.limit(bufferInfo.offset + bufferInfo.size);
            }
            m4451e(bufferInfo.presentationTimeUs);
        }
        boolean z = this.f34955e || bufferInfo.presentationTimeUs < this.f1491e;
        long j5 = this.f35007e.appmetrica;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.f34977e = z2;
        ByteBuffer byteBuffer = this.f35002e;
        int i2 = this.f34965e;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        C16975e c16975e = this.f34993e;
        c16975e.getClass();
        if (!mo2726finally(j, j2, interfaceC5827e, byteBuffer, i2, i3, 1, j6, z, z2, c16975e)) {
            return false;
        }
        mo4093return(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.f35005e && this.f34977e) {
            this.f1505e.getClass();
            this.f34983e = System.currentTimeMillis();
        }
        this.f34965e = -1;
        this.f35002e = null;
        if (!z3) {
            return true;
        }
        m4462throws();
        return false;
    }

    /* renamed from: new, reason: not valid java name */
    public final void m4458new(MediaCrypto mediaCrypto, boolean z) {
        C16975e c16975e = this.f34969e;
        c16975e.getClass();
        if (this.f35018e == null) {
            try {
                List m4464while = m4464while(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f35018e = arrayDeque;
                if (this.f34986e) {
                    arrayDeque.addAll(m4464while);
                } else {
                    ArrayList arrayList = (ArrayList) m4464while;
                    if (!arrayList.isEmpty()) {
                        this.f35018e.add((C10643e) arrayList.get(0));
                    }
                }
                this.f34997e = null;
            } catch (C1393e e) {
                throw new C1168e(c16975e, e, z, -49998);
            }
        }
        if (this.f35018e.isEmpty()) {
            throw new C1168e(c16975e, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f35018e;
        arrayDeque2.getClass();
        while (this.f34976e == null) {
            C10643e c10643e = (C10643e) arrayDeque2.peekFirst();
            c10643e.getClass();
            if (!mo4094strictfp(c16975e) || !mo4078e(c10643e)) {
                return;
            }
            try {
                m4444catch(c10643e, mediaCrypto);
            } catch (Exception e2) {
                AbstractC2803e.amazon("MediaCodecRenderer", "Failed to initialize decoder: " + c10643e, e2);
                arrayDeque2.removeFirst();
                C1168e c1168e = new C1168e("Decoder init failed: " + c10643e.ad + ", " + c16975e, e2, c16975e.loadAd, z, c10643e, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                mo2733private(c1168e);
                C1168e c1168e2 = this.f34997e;
                if (c1168e2 == null) {
                    this.f34997e = c1168e;
                } else {
                    this.f34997e = new C1168e(c1168e2.getMessage(), c1168e2.getCause(), c1168e2.f3759e, c1168e2.f3757e, c1168e2.f3756e, c1168e2.f3758e);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f34997e;
                }
            }
        }
        this.f35018e = null;
    }

    /* renamed from: package */
    public abstract void mo2732package(String str, long j, long j2);

    @Override // defpackage.AbstractC0241e
    public final int premium(C16975e c16975e) {
        try {
            return mo2725e(this.f34959e, c16975e);
        } catch (C1393e e) {
            throw vip(e, c16975e, false, 4002);
        }
    }

    /* renamed from: private */
    public abstract void mo2733private(Exception exc);

    /* renamed from: protected */
    public abstract float mo2734protected(float f, C16975e c16975e, C16975e[] c16975eArr);

    /* renamed from: public */
    public void mo4092public() {
        this.f34962e = -1;
        this.f34985e.f15296e = null;
        this.f34965e = -1;
        this.f35002e = null;
        this.f34956e = -9223372036854775807L;
        m4448default().appmetrica = -9223372036854775807L;
        this.f34951e = -9223372036854775807L;
        this.f34961e = -9223372036854775807L;
        this.f35005e = false;
        this.f34983e = -9223372036854775807L;
        this.f34964e = false;
        this.f35008e = false;
        this.f35000e = false;
        this.f34977e = false;
        this.f34963e = 0;
        this.f34992e = 0;
        this.f34980e = this.f34960e ? 1 : 0;
        this.f34955e = false;
        this.f34996e = 0L;
    }

    /* renamed from: return */
    public void mo4093return(long j) {
        this.f34951e = j;
        while (true) {
            ArrayDeque arrayDeque = this.f34978e;
            if (arrayDeque.isEmpty() || j < ((C16659e) arrayDeque.peek()).ad) {
                return;
            }
            C16659e c16659e = (C16659e) arrayDeque.poll();
            c16659e.getClass();
            m4453e(c16659e);
            mo2720else();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:0x0079 BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // defpackage.AbstractC0241e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void signatures(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.signatures(long, long):void");
    }

    /* renamed from: static */
    public abstract void mo2735static(C16975e c16975e, MediaFormat mediaFormat);

    /* renamed from: strictfp */
    public boolean mo4094strictfp(C16975e c16975e) {
        return true;
    }

    @Override // defpackage.AbstractC0241e
    public final int subs() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.AbstractC0241e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void subscription(defpackage.C16975e[] r12, long r13, long r15, defpackage.C18208e r17) {
        /*
            r11 = this;
            eًٖۧ r12 = r11.f35007e
            long r0 = r12.metrica
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            eًٖۧ r4 = new eًٖۧ
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m4453e(r4)
            boolean r12 = r11.f34972e
            if (r12 == 0) goto L56
            r11.mo2720else()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f34978e
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f34956e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f34951e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            eًٖۧ r4 = new eًٖۧ
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m4453e(r4)
            eًٖۧ r12 = r11.f35007e
            long r12 = r12.metrica
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.mo2720else()
        L56:
            return
        L57:
            eًٖۧ r0 = new eًٖۧ
            long r1 = r11.f34956e
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.subscription(eٌْٗ[], long, long, eَٛ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r2.purchase() != null) goto L74;
     */
    /* renamed from: super, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4459super() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC17844e.m4459super():void");
    }

    /* renamed from: switch */
    public void mo4095switch(C7507e c7507e) {
    }

    /* renamed from: synchronized */
    public void mo2736synchronized() {
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m4460this() {
        if (!this.f34964e) {
            m4450e();
            return true;
        }
        this.f34963e = 1;
        if (this.f35019e) {
            this.f34992e = 3;
            return false;
        }
        this.f34992e = 2;
        return true;
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m4461throw() {
        try {
            InterfaceC5827e interfaceC5827e = this.f34976e;
            interfaceC5827e.getClass();
            interfaceC5827e.flush();
        } finally {
            mo4092public();
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m4462throws() {
        int i = this.f34992e;
        if (i == 1) {
            m4461throw();
            return;
        }
        if (i == 2) {
            m4461throw();
            m4450e();
        } else if (i != 3) {
            this.f34958e = true;
            mo2727for();
        } else {
            m4463volatile();
            m4459super();
        }
    }

    /* renamed from: transient */
    public abstract void mo2737transient(C18520e c18520e);

    /* renamed from: try */
    public int mo4096try(C7507e c7507e) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: volatile, reason: not valid java name */
    public final void m4463volatile() {
        try {
            InterfaceC5827e interfaceC5827e = this.f34976e;
            if (interfaceC5827e != null) {
                interfaceC5827e.release();
                this.f34987e.vip++;
                C10643e c10643e = this.f34975e;
                c10643e.getClass();
                mo2729import(c10643e.ad);
            }
            this.f34976e = null;
            try {
                MediaCrypto mediaCrypto = this.f35013e;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f34976e = null;
            try {
                MediaCrypto mediaCrypto2 = this.f35013e;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final List m4464while(boolean z) {
        C16975e c16975e = this.f34969e;
        c16975e.getClass();
        C2282e c2282e = this.f34959e;
        ArrayList mo2718break = mo2718break(c2282e, c16975e, z);
        if (!mo2718break.isEmpty() || !z) {
            return mo2718break;
        }
        ArrayList mo2718break2 = mo2718break(c2282e, c16975e, false);
        if (!mo2718break2.isEmpty()) {
            AbstractC2803e.smaato("MediaCodecRenderer", "Drm session requires secure decoder for " + c16975e.loadAd + ", but no secure decoder available. Trying to proceed with " + mo2718break2 + ".");
        }
        return mo2718break2;
    }
}
