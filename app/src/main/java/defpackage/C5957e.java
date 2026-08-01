package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5957e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f12557e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f12558e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f12559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5957e(ByteBuffer byteBuffer, C18524e c18524e, int i) {
        super(byteBuffer, c18524e, 7);
        this.f12558e = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [eؓ۠ۨ, java.lang.Object] */
    @Override // defpackage.AbstractC11130e
    /* renamed from: eٓٔؔ */
    public final boolean mo741e() {
        EnumC12588e enumC12588e;
        EnumC8271e enumC8271e;
        boolean z = false;
        switch (this.f12558e) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
                short s = byteBuffer.getShort();
                C7936e c7936e = AbstractC1983e.ad;
                int i = s & 65535;
                Integer valueOf = Integer.valueOf(i);
                HashMap hashMap = EnumC14035e.f27757e;
                this.f12557e = (EnumC14035e) hashMap.get(valueOf);
                C0521e c0521e = (C0521e) this.f12559e;
                c0521e.appmetrica = byteBuffer.getShort() & 65535;
                c0521e.purchase = byteBuffer.getInt();
                int i2 = byteBuffer.getInt();
                c0521e.smaato = i2;
                c0521e.license = (i2 * 8) / 1000;
                c0521e.startapp = false;
                byteBuffer.getShort();
                c0521e.billing = byteBuffer.getShort() & 65535;
                EnumC14035e enumC14035e = (EnumC14035e) this.f12557e;
                if (enumC14035e != null && enumC14035e == EnumC14035e.f27756e && (byteBuffer.getShort() & 65535) == 22) {
                    c0521e.billing = byteBuffer.getShort() & 65535;
                    byteBuffer.getInt();
                    this.f12557e = (EnumC14035e) hashMap.get(Integer.valueOf(byteBuffer.getShort() & 65535));
                }
                EnumC14035e enumC14035e2 = (EnumC14035e) this.f12557e;
                if (enumC14035e2 == null) {
                    c0521e.yandex = "Unknown Sub Format Code:" + AbstractC6069e.metrica(i);
                } else if (c0521e.billing > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((EnumC14035e) this.f12557e).f27758e);
                    sb.append(" ");
                    c0521e.yandex = AbstractC17861e.smaato(c0521e.billing, " bits", sb);
                } else {
                    c0521e.yandex = enumC14035e2.f27758e;
                }
                return true;
            default:
                String adcel = AbstractC1983e.adcel((ByteBuffer) this.f22046e);
                HashMap hashMap2 = EnumC2113e.f5461e;
                if (adcel.equals("INFO")) {
                    C0829e c0829e = (C0829e) this.f12557e;
                    ?? obj = new Object();
                    C14267e c14267e = new C14267e();
                    obj.ad = c14267e;
                    c0829e.f3214e = c14267e;
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f22046e;
                    while (byteBuffer2.remaining() >= AbstractC3395e.license) {
                        String adcel2 = AbstractC1983e.adcel(byteBuffer2);
                        if (adcel2.trim().isEmpty()) {
                            z = true;
                            ((C0829e) this.f12557e).f3214e.f28203e = Long.valueOf(((C18524e) this.f22047e).f36319e);
                            C14267e c14267e2 = ((C0829e) this.f12557e).f3214e;
                            C18524e c18524e = (C18524e) this.f22047e;
                            c14267e2.f28202e = Long.valueOf(c18524e.f36319e + 8 + c18524e.f36318e);
                            ((C0829e) this.f12557e).f3217e = true;
                        } else {
                            int i3 = byteBuffer2.getInt();
                            if (Character.isAlphabetic(adcel2.charAt(0)) && Character.isAlphabetic(adcel2.charAt(1)) && Character.isAlphabetic(adcel2.charAt(2)) && Character.isAlphabetic(adcel2.charAt(3))) {
                                try {
                                    String billing = AbstractC1983e.billing(byteBuffer2, 0, i3, AbstractC4639e.metrica);
                                    C7936e c7936e2 = C2150e.vip;
                                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                                    c7936e2.getClass();
                                    int i4 = C1724e.ad;
                                    EnumC12588e enumC12588e2 = EnumC12588e.TRACKNO;
                                    synchronized (EnumC12588e.class) {
                                        try {
                                            if (EnumC12588e.f25300e.isEmpty()) {
                                                for (EnumC12588e enumC12588e3 : EnumC12588e.values()) {
                                                    EnumC12588e.f25300e.put(enumC12588e3.f25306e, enumC12588e3);
                                                }
                                            }
                                            enumC12588e = (EnumC12588e) EnumC12588e.f25300e.get(adcel2);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (enumC12588e != null && (enumC8271e = enumC12588e.f25305e) != null) {
                                        try {
                                            obj.ad.mopub(enumC8271e, billing);
                                        } catch (C12795e e) {
                                            C7936e c7936e3 = C2150e.vip;
                                            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                                            e.getMessage();
                                            c7936e3.getClass();
                                            int i5 = C1724e.ad;
                                        }
                                    } else if (!adcel2.trim().isEmpty()) {
                                        obj.ad.f28204e.add(new C18096e(adcel2, billing));
                                    }
                                    if (AbstractC1983e.yandex(i3) && byteBuffer2.hasRemaining()) {
                                        byteBuffer2.get();
                                    }
                                } catch (BufferUnderflowException e2) {
                                    C7936e c7936e4 = C2150e.vip;
                                    EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                                    e2.getMessage();
                                    c7936e4.getClass();
                                    int i6 = C1724e.ad;
                                }
                            } else {
                                C7936e c7936e5 = C2150e.vip;
                                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                                c7936e5.getClass();
                                int i7 = C1724e.ad;
                            }
                            ((C0829e) this.f12557e).f3214e.f28203e = Long.valueOf(((C18524e) this.f22047e).f36319e);
                            C14267e c14267e22 = ((C0829e) this.f12557e).f3214e;
                            C18524e c18524e2 = (C18524e) this.f22047e;
                            c14267e22.f28202e = Long.valueOf(c18524e2.f36319e + 8 + c18524e2.f36318e);
                            ((C0829e) this.f12557e).f3217e = true;
                        }
                    }
                    z = true;
                    ((C0829e) this.f12557e).f3214e.f28203e = Long.valueOf(((C18524e) this.f22047e).f36319e);
                    C14267e c14267e222 = ((C0829e) this.f12557e).f3214e;
                    C18524e c18524e22 = (C18524e) this.f22047e;
                    c14267e222.f28202e = Long.valueOf(c18524e22.f36319e + 8 + c18524e22.f36318e);
                    ((C0829e) this.f12557e).f3217e = true;
                }
                return z;
        }
    }

    @Override // defpackage.AbstractC11130e
    public final String toString() {
        switch (this.f12558e) {
            case 0:
                return "RIFF-WAVE Header:\nIs valid?: false";
            default:
                return "RIFF-WAVE Header:\nIs valid?: false";
        }
    }
}
