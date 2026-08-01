package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5180e {
    public static final C17866e ad;

    static {
        C17866e c17866e = AbstractC8809e.ad;
        ad = new C17866e();
    }

    public static final void ad(AbstractC13616e abstractC13616e, int i, int i2) {
        if (!(abstractC13616e instanceof AbstractC6126e)) {
            vip(abstractC13616e, i & abstractC13616e.f27014e, i2);
            return;
        }
        AbstractC6126e abstractC6126e = (AbstractC6126e) abstractC13616e;
        int i3 = abstractC6126e.f12872e;
        vip(abstractC13616e, i3 & i, i2);
        int i4 = (~i3) & i;
        for (AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
            ad(abstractC13616e2, i4, i2);
        }
    }

    public static final int appmetrica(AbstractC13616e abstractC13616e) {
        int i = abstractC13616e.f27014e;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC13616e.getClass();
        C17866e c17866e = ad;
        int license = c17866e.license(cls);
        if (license >= 0) {
            return c17866e.metrica[license];
        }
        int i2 = abstractC13616e instanceof InterfaceC17303e ? 3 : 1;
        if (abstractC13616e instanceof InterfaceC8501e) {
            i2 |= 4;
        }
        if (abstractC13616e instanceof InterfaceC17453e) {
            i2 |= 8;
        }
        if (abstractC13616e instanceof InterfaceC4890e) {
            i2 |= 16;
        }
        if (abstractC13616e instanceof InterfaceC4238e) {
            i2 |= 32;
        }
        if (abstractC13616e instanceof InterfaceC0862e) {
            i2 |= 64;
        }
        if (abstractC13616e instanceof InterfaceC18105e) {
            i2 |= 4194432;
        } else if (abstractC13616e instanceof InterfaceC12415e) {
            i2 |= 128;
        }
        if (abstractC13616e instanceof InterfaceC9629e) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (abstractC13616e instanceof C0404e) {
            i2 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        }
        if (abstractC13616e instanceof C11795e) {
            i2 |= 1024;
        }
        if (abstractC13616e instanceof InterfaceC6505e) {
            i2 |= 2048;
        }
        if (abstractC13616e instanceof InterfaceC13046e) {
            i2 |= 4096;
        }
        if (abstractC13616e instanceof InterfaceC13409e) {
            i2 |= 8192;
        }
        if (abstractC13616e instanceof C16586e) {
            i2 |= 16384;
        }
        if (abstractC13616e instanceof InterfaceC1683e) {
            i2 |= 32768;
        }
        if (abstractC13616e instanceof InterfaceC6459e) {
            i2 |= 262144;
        }
        if (abstractC13616e instanceof InterfaceC6756e) {
            i2 |= 524288;
        }
        if (abstractC13616e instanceof InterfaceC1946e) {
            i2 |= 2097152;
        }
        if (abstractC13616e instanceof C2993e) {
            i2 |= 8388608;
        }
        c17866e.billing(i2, cls);
        return i2;
    }

    public static final boolean billing(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int license(InterfaceC8177e interfaceC8177e) {
        int i = interfaceC8177e instanceof InterfaceC16827e ? 3 : 1;
        if (interfaceC8177e instanceof C16862e) {
            i |= 4;
        }
        if (interfaceC8177e instanceof InterfaceC11183e) {
            i |= 8;
        }
        if (interfaceC8177e instanceof C13760e) {
            i |= 16;
        }
        if (interfaceC8177e instanceof AbstractC8704e) {
            i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (interfaceC8177e instanceof InterfaceC0684e) {
            i |= 64;
        }
        return interfaceC8177e instanceof InterfaceC6756e ? 524288 | i : i;
    }

    public static final void metrica(AbstractC13616e abstractC13616e) {
        if (!abstractC13616e.f27016e) {
            AbstractC14070e.metrica("autoInvalidateUpdatedNode called on unattached node");
        }
        ad(abstractC13616e, -1, 0);
    }

    public static final int purchase(AbstractC13616e abstractC13616e) {
        if (!(abstractC13616e instanceof AbstractC6126e)) {
            return appmetrica(abstractC13616e);
        }
        AbstractC6126e abstractC6126e = (AbstractC6126e) abstractC13616e;
        int i = abstractC6126e.f12872e;
        for (AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e; abstractC13616e2 != null; abstractC13616e2 = abstractC13616e2.f27024e) {
            i |= purchase(abstractC13616e2);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void vip(AbstractC13616e abstractC13616e, int i, int i2) {
        if (i2 != 0 || abstractC13616e.mo293e()) {
            if ((i & 2) != 0 && (abstractC13616e instanceof InterfaceC17303e)) {
                AbstractC1599e.purchase((InterfaceC17303e) abstractC13616e);
                if (i2 == 2) {
                    AbstractC5851e.yandex(abstractC13616e, 2).m4398e();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                AbstractC5851e.mopub(abstractC13616e).m3710goto();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                AbstractC5851e.mopub(abstractC13616e).m3716new(false);
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (abstractC13616e instanceof InterfaceC9629e)) {
                if (i2 == 1) {
                    C13915e mopub = AbstractC5851e.mopub(abstractC13616e);
                    mopub.m3720static(mopub.f27595e + 1);
                } else if (i2 == 2) {
                    AbstractC5851e.mopub(abstractC13616e).m3720static(r0.f27595e - 1);
                }
                if (i2 != 2) {
                    C13915e mopub2 = AbstractC5851e.mopub(abstractC13616e);
                    if (mopub2.f27595e != 0 && !mopub2.admob() && !mopub2.subscription() && !mopub2.f27600e) {
                        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(mopub2);
                        C5891e c5891e = viewTreeObserverOnGlobalLayoutListenerC5014e.f10636e.appmetrica;
                        c5891e.getClass();
                        if (mopub2.f27595e > 0) {
                            ((C12431e) c5891e.f12440e).license(mopub2);
                            mopub2.f27600e = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC5014e.m1701goto(null);
                    }
                }
            }
            if ((i & 4) != 0 && (abstractC13616e instanceof InterfaceC8501e)) {
                AbstractC12640e.advert((InterfaceC8501e) abstractC13616e);
            }
            if ((i & 8) != 0 && (abstractC13616e instanceof InterfaceC17453e)) {
                AbstractC5851e.mopub(abstractC13616e).f27626e = true;
            }
            if ((i & 64) != 0 && (abstractC13616e instanceof InterfaceC0862e)) {
                C11874e c11874e = AbstractC5851e.mopub((InterfaceC0862e) abstractC13616e).f27612e;
                c11874e.Signature.f25190e = true;
                C17596e c17596e = c11874e.admob;
                if (c17596e != null) {
                    c17596e.f34478e = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC13616e instanceof InterfaceC6505e)) {
                InterfaceC6505e interfaceC6505e = (InterfaceC6505e) abstractC13616e;
                C1524e.vip = null;
                interfaceC6505e.mo578this(C1524e.ad);
                if (C1524e.vip != null) {
                    AbstractC13616e abstractC13616e2 = (AbstractC13616e) interfaceC6505e;
                    if (!abstractC13616e2.f27022e.f27016e) {
                        AbstractC14070e.metrica("visitChildren called on an unattached node");
                    }
                    C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
                    AbstractC13616e abstractC13616e3 = abstractC13616e2.f27022e;
                    AbstractC13616e abstractC13616e4 = abstractC13616e3.f27024e;
                    if (abstractC13616e4 == null) {
                        AbstractC5851e.ad(c12431e, abstractC13616e3);
                    } else {
                        c12431e.license(abstractC13616e4);
                    }
                    while (true) {
                        int i3 = c12431e.f24868e;
                        if (i3 == 0) {
                            break;
                        }
                        AbstractC13616e abstractC13616e5 = (AbstractC13616e) c12431e.amazon(i3 - 1);
                        if ((abstractC13616e5.f27020e & 1024) == 0) {
                            AbstractC5851e.ad(c12431e, abstractC13616e5);
                        } else {
                            while (true) {
                                if (abstractC13616e5 == null) {
                                    break;
                                }
                                if ((abstractC13616e5.f27014e & 1024) != 0) {
                                    C12431e c12431e2 = null;
                                    while (abstractC13616e5 != null) {
                                        if (abstractC13616e5 instanceof C11795e) {
                                            C11795e c11795e = (C11795e) abstractC13616e5;
                                            C10992e c10992e = ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).license;
                                            if (c10992e.metrica.ad(c11795e)) {
                                                c10992e.ad();
                                            }
                                        } else if ((abstractC13616e5.f27014e & 1024) != 0 && (abstractC13616e5 instanceof AbstractC6126e)) {
                                            int i4 = 0;
                                            for (AbstractC13616e abstractC13616e6 = ((AbstractC6126e) abstractC13616e5).f12873e; abstractC13616e6 != null; abstractC13616e6 = abstractC13616e6.f27024e) {
                                                if ((abstractC13616e6.f27014e & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        abstractC13616e5 = abstractC13616e6;
                                                    } else {
                                                        if (c12431e2 == null) {
                                                            c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                                        }
                                                        if (abstractC13616e5 != null) {
                                                            c12431e2.license(abstractC13616e5);
                                                            abstractC13616e5 = null;
                                                        }
                                                        c12431e2.license(abstractC13616e6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        abstractC13616e5 = AbstractC5851e.vip(c12431e2);
                                    }
                                } else {
                                    abstractC13616e5 = abstractC13616e5.f27024e;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (abstractC13616e instanceof InterfaceC13046e)) {
                InterfaceC13046e interfaceC13046e = (InterfaceC13046e) abstractC13616e;
                C10992e c10992e2 = ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(interfaceC13046e)).getFocusOwner()).license;
                if (c10992e2.license.ad(interfaceC13046e)) {
                    c10992e2.ad();
                }
            }
            if ((i & 2097152) != 0 && (abstractC13616e instanceof InterfaceC1946e) && i2 == 2) {
                ((InterfaceC1946e) abstractC13616e).mo733switch();
            }
        }
    }
}
