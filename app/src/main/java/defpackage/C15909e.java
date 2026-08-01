package defpackage;

import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.id3.framebody.FrameBodyTCON;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15909e extends AbstractC11095e {

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C7936e f31353e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f31355e = false;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f31354e = false;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f31353e = new C7936e(2);
    }

    public C15909e() {
        m4042super();
    }

    public C15909e(C16151e c16151e, C18457e c18457e, String str, boolean z) {
        this.f31887e = str;
        try {
            m4041strictfp(c18457e.vip);
            m4039new(this.f31354e ? C1051e.ad(c16151e) : c16151e, c18457e.metrica, z);
            C7936e c7936e = f31353e;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            this.f21995e.keySet().size();
            c7936e.getClass();
            int i = C1724e.ad;
        } catch (IOException e) {
            throw new Exception("ID3v2_2.20 error reading tag", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(6:7|(1:27)(2:11|(2:13|(1:15)(1:26)))|16|17|18|19)|28|16|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r1 = defpackage.EnumC1005e.f3456e;
        r1 = defpackage.C1724e.ad;
        r0.f28795e = new ealvatag.tag.id3.framebody.FrameBodyUnsupported(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r0 = defpackage.EnumC1005e.f3456e;
        r0 = defpackage.C1724e.ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        throw new java.lang.RuntimeException(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؓؓ, eّۣۘ, eؚٔۦ] */
    /* renamed from: final, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C12707e m4038final(java.lang.String r4) {
        /*
            eّۣۘ r0 = new eّۣۘ
            java.lang.String r1 = "ealvatag.tag.id3.framebody.FrameBody"
            r0.<init>()
            eًْٔ r2 = defpackage.C12707e.f25455e
            eِؒٚ[] r3 = defpackage.EnumC1005e.f3456e
            r2.getClass()
            int r2 = defpackage.C1724e.ad
            r0.f4425e = r4
            boolean r2 = defpackage.AbstractC2251e.advert(r4)
            if (r2 == 0) goto L59
            eؚؑٛ r2 = defpackage.AbstractC14953e.vip
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L23
            goto L59
        L23:
            java.lang.String r2 = "CRM"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2c
            goto L59
        L2c:
            java.lang.String r2 = "TYE"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L56
            java.lang.String r2 = "TIM"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L3d
            goto L56
        L3d:
            boolean r2 = defpackage.AbstractC2251e.advert(r4)
            if (r2 == 0) goto L59
            int r2 = r4.length()
            r3 = 3
            if (r2 >= r3) goto L4c
            r2 = 0
            goto L5a
        L4c:
            r2 = 0
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = defpackage.AbstractC14953e.ad(r2)
            goto L5a
        L56:
            java.lang.String r2 = "TDRC"
            goto L5a
        L59:
            r2 = r4
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            r3.append(r2)     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            eّْؗ r1 = (defpackage.AbstractC12444e) r1     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            r0.f28795e = r1     // Catch: java.lang.Throwable -> L73 java.lang.ClassNotFoundException -> L7e
            goto L89
        L73:
            r4 = move-exception
            eِؒٚ[] r0 = defpackage.EnumC1005e.f3456e
            int r0 = defpackage.C1724e.ad
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L7e:
            eِؒٚ[] r1 = defpackage.EnumC1005e.f3456e
            int r1 = defpackage.C1724e.ad
            ealvatag.tag.id3.framebody.FrameBodyUnsupported r1 = new ealvatag.tag.id3.framebody.FrameBodyUnsupported
            r1.<init>(r4)
            r0.f28795e = r1
        L89:
            eّْؗ r4 = r0.f28795e
            r4.setHeader(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15909e.m4038final(java.lang.String):eّۣۘ");
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.license(enumC8271e, "generickey");
        if (enumC8271e != EnumC8271e.GENRE) {
            return super.ad(enumC8271e, strArr);
        }
        String str = (String) AbstractC5542e.purchase(strArr, "values");
        C12707e m4038final = m4038final((String) mo2919class(enumC8271e).f25750e);
        FrameBodyTCON frameBodyTCON = (FrameBodyTCON) m4038final.f28795e;
        frameBodyTCON.setV23Format();
        frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v22Genre(str));
        return m4038final;
    }

    @Override // defpackage.AbstractC11095e
    public final String ads(String str) {
        return (String) AbstractC4141e.vip.get(str);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return C16582e.yandex().adcel().keySet();
    }

    @Override // defpackage.AbstractC11095e, defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        if (enumC8271e != EnumC8271e.GENRE) {
            return super.appmetrica(enumC8271e);
        }
        AbstractC17475e metrica = metrica(enumC8271e);
        return (metrica == null || metrica.size() <= 0) ? C1444e.f4274e : AbstractC9621e.license(FrameBodyTCON.convertID3v22GenreToGeneric(((FrameBodyTCON) ((AbstractC1550e) metrica.get(0)).f28795e).getValues().get(0)));
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: break */
    public final long mo2918break(File file, long j) {
        this.f31887e = file.getName();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f31353e;
        c7936e.getClass();
        int i = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        C12927e.license();
        this.f31354e = false;
        int signatures = AbstractC11095e.signatures(byteArray.length + 10, (int) j);
        int length = signatures - (byteArray.length + 10);
        c7936e.getClass();
        c7936e.getClass();
        c7936e.getClass();
        m2994implements(file, m4040private(length, byteArray.length), byteArray, length, signatures, j);
        return signatures;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: class */
    public final C12894e mo2919class(EnumC8271e enumC8271e) {
        EnumC10791e enumC10791e = (EnumC10791e) C16582e.yandex().adcel().get(enumC8271e);
        if (enumC10791e != null) {
            return new C12894e(2, enumC8271e, enumC10791e.f21397e, enumC10791e.f21396e);
        }
        throw new C14803e(enumC8271e.name(), 17, (byte) 0);
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: default */
    public final void mo2920default(WritableByteChannel writableByteChannel, int i) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f31353e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        byte[] byteArray = m2992case().toByteArray();
        int length = byteArray.length;
        c7936e.getClass();
        C12927e.license();
        this.f31354e = false;
        int signatures = i > 0 ? AbstractC11095e.signatures(byteArray.length + 10, i) - (byteArray.length + 10) : 0;
        writableByteChannel.write(m4040private(signatures, byteArray.length));
        writableByteChannel.write(ByteBuffer.wrap(byteArray));
        if (signatures > 0) {
            writableByteChannel.write(ByteBuffer.wrap(new byte[signatures]));
        }
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC16225e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15909e)) {
            return false;
        }
        C15909e c15909e = (C15909e) obj;
        return this.f31355e == c15909e.f31355e && this.f31354e == c15909e.f31354e && super.equals(obj);
    }

    @Override // defpackage.AbstractC11095e, defpackage.AbstractC11463e
    public final int getSize() {
        return super.getSize() + 10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eُْۛ] */
    @Override // defpackage.AbstractC11095e
    /* renamed from: goto */
    public final Comparator mo2922goto() {
        if (C13200e.f26207e == null) {
            C13200e.f26207e = new Object();
        }
        return C13200e.f26207e;
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: interface */
    public final AbstractC8623e mo2923interface() {
        return C16582e.yandex();
    }

    @Override // defpackage.AbstractC11095e
    /* renamed from: native */
    public final void mo2924native(String str, AbstractC1550e abstractC1550e) {
        AbstractC12444e abstractC12444e = abstractC1550e.f28795e;
        if (abstractC12444e instanceof FrameBodyTCON) {
            ((FrameBodyTCON) abstractC12444e).setV23Format();
        }
        super.mo2924native(str, abstractC1550e);
    }

    /* renamed from: new, reason: not valid java name */
    public final void m4039new(C16151e c16151e, int i, boolean z) {
        m4042super();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f31353e;
        c7936e.getClass();
        int i2 = C1724e.ad;
        while (c16151e.f31731e > 0) {
            try {
                C12707e c12707e = new C12707e(c16151e, this.f31887e, z);
                if (AbstractC1550e.isVip(c12707e.f4425e) && z) {
                    this.f31886e = true;
                } else {
                    mo2924native(c12707e.f4425e, c12707e);
                }
            } catch (C4775e unused) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                return;
            } catch (C0229e unused2) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                return;
            } catch (C1775e unused3) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
            } catch (C10754e unused4) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i6 = C1724e.ad;
            } catch (C14572e unused5) {
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i7 = C1724e.ad;
                return;
            } catch (C10144e unused6) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i8 = C1724e.ad;
            } catch (IOException unused7) {
                EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i9 = C1724e.ad;
            }
        }
    }

    @Override // defpackage.AbstractC11095e
    public final String premium() {
        return DataTypes.OBJ_IMAGE_FORMAT;
    }

    /* renamed from: private, reason: not valid java name */
    public final ByteBuffer m4040private(int i, int i2) {
        this.f31355e = false;
        ByteBuffer allocate = ByteBuffer.allocate(10);
        allocate.put(AbstractC11095e.f21993e);
        allocate.put((byte) 2);
        allocate.put((byte) 0);
        byte b = this.f31354e ? (byte) (-128) : (byte) 0;
        if (this.f31355e) {
            b = (byte) (b | 64);
        }
        allocate.put(b);
        allocate.put(AbstractC8294e.startapp(i + i2));
        allocate.flip();
        return allocate;
    }

    @Override // defpackage.AbstractC16225e
    public final byte pro() {
        return (byte) 2;
    }

    @Override // defpackage.AbstractC11463e
    public final void read(ByteBuffer byteBuffer) {
        if (!m2995protected(byteBuffer)) {
            throw new Exception("ID3v2.20 tag not found");
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f31353e;
        c7936e.getClass();
        int i = C1724e.ad;
        m4041strictfp(byteBuffer.get());
        int vip = AbstractC8294e.vip(byteBuffer);
        ByteBuffer slice = byteBuffer.slice();
        if (this.f31354e) {
            slice = AbstractC13191e.ad(slice);
        }
        m4042super();
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        slice.position();
        c7936e.getClass();
        while (slice.position() < vip) {
            try {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                slice.position();
                c7936e.getClass();
                int i2 = C1724e.ad;
                C12707e c12707e = new C12707e(this.f31887e, slice);
                mo2924native(c12707e.f4425e, c12707e);
            } catch (C4775e unused) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                slice.position();
                int i3 = C1724e.ad;
            } catch (C0229e unused2) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                int i4 = C1724e.ad;
            } catch (C1775e unused3) {
                EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                int i5 = C1724e.ad;
            } catch (C10754e unused4) {
                EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                int i6 = C1724e.ad;
            } catch (C14572e unused5) {
                EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                int i7 = C1724e.ad;
            }
        }
        EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
        this.f21995e.keySet().size();
        c7936e.getClass();
        int i8 = C1724e.ad;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m4041strictfp(byte b) {
        boolean z = (b & 128) != 0;
        this.f31354e = z;
        this.f31355e = (b & 64) != 0;
        C7936e c7936e = f31353e;
        if (z) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i = C1724e.ad;
        }
        if (this.f31355e) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
        if ((b & 32) != 0) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
        }
        if ((b & 16) != 0) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
        }
        if ((b & 8) != 0) {
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
        }
        if ((b & 4) != 0) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
        }
        if ((b & 2) != 0) {
            EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
        }
        if ((b & 1) != 0) {
            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i8 = C1724e.ad;
        }
    }

    /* renamed from: super, reason: not valid java name */
    public final void m4042super() {
        if (this.f21995e == null) {
            this.f21995e = new LinkedHashMap();
        }
        if (this.f21999e == null) {
            this.f21999e = new LinkedHashMap();
        }
        this.f21995e.clear();
        this.f21999e.clear();
    }

    @Override // defpackage.AbstractC11095e
    public final /* bridge */ /* synthetic */ AbstractC1550e tapsense(String str) {
        return m4038final(str);
    }
}
