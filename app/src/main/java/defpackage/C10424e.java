package defpackage;

import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10424e {
    public final InterfaceC6440e ad;
    public InterfaceC15169e license;
    public C4524e purchase;
    public C5401e yandex;
    public final HashMap vip = new HashMap();
    public final HashMap metrica = new HashMap();
    public boolean appmetrica = true;
    public int billing = 3;

    public C10424e(InterfaceC6440e interfaceC6440e, C4524e c4524e) {
        this.ad = interfaceC6440e;
        this.purchase = c4524e;
    }

    public static void ad(C10424e c10424e) {
        InterfaceC6440e interfaceC6440e = c10424e.ad;
        if (interfaceC6440e instanceof C1969e) {
            C1969e c1969e = (C1969e) interfaceC6440e;
            synchronized (c1969e) {
                c1969e.f5175e = 1;
            }
        }
    }

    public final InterfaceC13125e vip(int i) {
        InterfaceC6823e interfaceC6823e;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.metrica;
        InterfaceC13125e interfaceC13125e = (InterfaceC13125e) hashMap.get(valueOf);
        if (interfaceC13125e != null) {
            return interfaceC13125e;
        }
        Integer valueOf2 = Integer.valueOf(i);
        HashMap hashMap2 = this.vip;
        InterfaceC6823e interfaceC6823e2 = (InterfaceC6823e) hashMap2.get(valueOf2);
        if (interfaceC6823e2 == null) {
            final InterfaceC15169e interfaceC15169e = this.license;
            interfaceC15169e.getClass();
            final int i2 = 0;
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i != 2) {
                        final int i5 = 3;
                        if (i == 3) {
                            interfaceC6823e = new C8431e(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC13125e.class));
                        } else {
                            if (i != 4) {
                                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unrecognized contentType: "));
                            }
                            interfaceC6823e2 = new InterfaceC6823e() { // from class: eؙۣۡ
                                @Override // defpackage.InterfaceC6823e
                                public final Object get() {
                                    switch (i5) {
                                        case 0:
                                            return C0433e.purchase((Class) this, interfaceC15169e);
                                        case 1:
                                            return C0433e.purchase((Class) this, interfaceC15169e);
                                        case 2:
                                            return C0433e.purchase((Class) this, interfaceC15169e);
                                        default:
                                            return new C15322e(interfaceC15169e, ((C10424e) this).ad);
                                    }
                                }
                            };
                        }
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(InterfaceC13125e.class);
                        interfaceC6823e = new InterfaceC6823e() { // from class: eؙۣۡ
                            @Override // defpackage.InterfaceC6823e
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        return C0433e.purchase((Class) asSubclass, interfaceC15169e);
                                    case 1:
                                        return C0433e.purchase((Class) asSubclass, interfaceC15169e);
                                    case 2:
                                        return C0433e.purchase((Class) asSubclass, interfaceC15169e);
                                    default:
                                        return new C15322e(interfaceC15169e, ((C10424e) asSubclass).ad);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC13125e.class);
                    interfaceC6823e = new InterfaceC6823e() { // from class: eؙۣۡ
                        @Override // defpackage.InterfaceC6823e
                        public final Object get() {
                            switch (i3) {
                                case 0:
                                    return C0433e.purchase((Class) asSubclass2, interfaceC15169e);
                                case 1:
                                    return C0433e.purchase((Class) asSubclass2, interfaceC15169e);
                                case 2:
                                    return C0433e.purchase((Class) asSubclass2, interfaceC15169e);
                                default:
                                    return new C15322e(interfaceC15169e, ((C10424e) asSubclass2).ad);
                            }
                        }
                    };
                }
                interfaceC6823e2 = interfaceC6823e;
            } else {
                final GenericDeclaration asSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC13125e.class);
                interfaceC6823e2 = new InterfaceC6823e() { // from class: eؙۣۡ
                    @Override // defpackage.InterfaceC6823e
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return C0433e.purchase((Class) asSubclass3, interfaceC15169e);
                            case 1:
                                return C0433e.purchase((Class) asSubclass3, interfaceC15169e);
                            case 2:
                                return C0433e.purchase((Class) asSubclass3, interfaceC15169e);
                            default:
                                return new C15322e(interfaceC15169e, ((C10424e) asSubclass3).ad);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i), interfaceC6823e2);
        }
        InterfaceC13125e interfaceC13125e2 = (InterfaceC13125e) interfaceC6823e2.get();
        C5401e c5401e = this.yandex;
        if (c5401e != null) {
            interfaceC13125e2.appmetrica(c5401e);
        }
        interfaceC13125e2.ad(this.purchase);
        interfaceC13125e2.metrica(this.appmetrica);
        interfaceC13125e2.vip(this.billing);
        hashMap.put(Integer.valueOf(i), interfaceC13125e2);
        return interfaceC13125e2;
    }
}
