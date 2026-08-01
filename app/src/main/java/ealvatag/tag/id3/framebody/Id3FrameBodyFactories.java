package ealvatag.tag.id3.framebody;

import defpackage.AbstractC8507e;
import defpackage.C16151e;
import defpackage.Csuper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class Id3FrameBodyFactories implements Id3FrameBodyFactory {
    private static volatile Id3FrameBodyFactory instance;
    private final AbstractC8507e factoryMap;

    private Id3FrameBodyFactories() {
        Csuper ad = AbstractC8507e.ad();
        ad.mo3904implements("AENC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.105
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyAENC(c16151e, i);
            }
        });
        ad.mo3904implements("APIC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.104
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyAPIC(c16151e, i);
            }
        });
        ad.mo3904implements("ASPI", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.103
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyASPI(c16151e, i);
            }
        });
        ad.mo3904implements("CHAP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.102
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyCHAP(c16151e, i);
            }
        });
        ad.mo3904implements("COMM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.101
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyCOMM(c16151e, i);
            }
        });
        ad.mo3904implements("COMR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.100
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyCOMR(c16151e, i);
            }
        });
        ad.mo3904implements("CRM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.99
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyCRM(c16151e, i);
            }
        });
        ad.mo3904implements("CTOC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.98
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyCTOC(c16151e, i);
            }
        });
        ad.mo3904implements("ENCR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.97
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyENCR(c16151e, i);
            }
        });
        ad.mo3904implements("EQU2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.96
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyEQU2(c16151e, i);
            }
        });
        ad.mo3904implements("EQUA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.95
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyEQUA(c16151e, i);
            }
        });
        ad.mo3904implements("ETCO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.94
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyETCO(c16151e, i);
            }
        });
        ad.mo3904implements("GEOB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.93
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyGEOB(c16151e, i);
            }
        });
        ad.mo3904implements("GRID", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.92
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyGRID(c16151e, i);
            }
        });
        ad.mo3904implements("GRP1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.91
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyGRP1(c16151e, i);
            }
        });
        ad.mo3904implements("IPLS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.90
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyIPLS(c16151e, i);
            }
        });
        ad.mo3904implements("LINK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.89
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyLINK(c16151e, i);
            }
        });
        ad.mo3904implements("MCDI", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.88
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyMCDI(c16151e, i);
            }
        });
        ad.mo3904implements("MLLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.87
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyMLLT(c16151e, i);
            }
        });
        ad.mo3904implements("MVIN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.86
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyMVIN(c16151e, i);
            }
        });
        ad.mo3904implements("MVNM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.85
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyMVNM(c16151e, i);
            }
        });
        ad.mo3904implements("OWNE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.84
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyOWNE(c16151e, i);
            }
        });
        ad.mo3904implements("PCNT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.83
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyPCNT(c16151e, i);
            }
        });
        ad.mo3904implements("PIC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.82
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyPIC(c16151e, i);
            }
        });
        ad.mo3904implements("POPM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.81
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyPOPM(c16151e, i);
            }
        });
        ad.mo3904implements("POSS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.80
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyPOSS(c16151e, i);
            }
        });
        ad.mo3904implements("PRIV", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.79
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyPRIV(c16151e, i);
            }
        });
        ad.mo3904implements("RBUF", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.78
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyRBUF(c16151e, i);
            }
        });
        ad.mo3904implements("RVA2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.77
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyRVA2(c16151e, i);
            }
        });
        ad.mo3904implements("RVAD", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.76
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyRVAD(c16151e, i);
            }
        });
        ad.mo3904implements("RVRB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.75
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyRVRB(c16151e, i);
            }
        });
        ad.mo3904implements("SEEK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.74
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodySEEK(c16151e, i);
            }
        });
        ad.mo3904implements("SIGN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.73
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodySIGN(c16151e, i);
            }
        });
        ad.mo3904implements("SYLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.72
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodySYLT(c16151e, i);
            }
        });
        ad.mo3904implements("SYTC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.71
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodySYTC(c16151e, i);
            }
        });
        ad.mo3904implements("TBPM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.70
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTBPM(c16151e, i);
            }
        });
        ad.mo3904implements("TCMP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.69
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTCMP(c16151e, i);
            }
        });
        ad.mo3904implements("TCOM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.68
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTCOM(c16151e, i);
            }
        });
        ad.mo3904implements("TCON", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.67
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTCON(c16151e, i);
            }
        });
        ad.mo3904implements("TCOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.66
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTCOP(c16151e, i);
            }
        });
        ad.mo3904implements("TDAT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.65
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDAT(c16151e, i);
            }
        });
        ad.mo3904implements("TDEN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.64
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDEN(c16151e, i);
            }
        });
        ad.mo3904implements("TDLY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.63
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDLY(c16151e, i);
            }
        });
        ad.mo3904implements("TDOR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.62
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDOR(c16151e, i);
            }
        });
        ad.mo3904implements("TDRC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.61
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDRC(c16151e, i);
            }
        });
        ad.mo3904implements("TDRL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.60
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDRL(c16151e, i);
            }
        });
        ad.mo3904implements("TDTG", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.59
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTDTG(c16151e, i);
            }
        });
        ad.mo3904implements("TENC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.58
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTENC(c16151e, i);
            }
        });
        ad.mo3904implements("TEXT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.57
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTEXT(c16151e, i);
            }
        });
        ad.mo3904implements("TFLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.56
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTFLT(c16151e, i);
            }
        });
        ad.mo3904implements("TIME", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.55
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTIME(c16151e, i);
            }
        });
        ad.mo3904implements("TIPL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.54
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTIPL(c16151e, i);
            }
        });
        ad.mo3904implements("TIT1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.53
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTIT1(c16151e, i);
            }
        });
        ad.mo3904implements("TIT2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.52
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTIT2(c16151e, i);
            }
        });
        ad.mo3904implements("TIT3", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.51
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTIT3(c16151e, i);
            }
        });
        ad.mo3904implements("TKEY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.50
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTKEY(c16151e, i);
            }
        });
        ad.mo3904implements("TLAN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.49
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTLAN(c16151e, i);
            }
        });
        ad.mo3904implements("TLEN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.48
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTLEN(c16151e, i);
            }
        });
        ad.mo3904implements("TMCL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.47
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTMCL(c16151e, i);
            }
        });
        ad.mo3904implements("TMED", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.46
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTMED(c16151e, i);
            }
        });
        ad.mo3904implements("TMOO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.45
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTMOO(c16151e, i);
            }
        });
        ad.mo3904implements("TOAL", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.44
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTOAL(c16151e, i);
            }
        });
        ad.mo3904implements("TOFN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.43
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTOFN(c16151e, i);
            }
        });
        ad.mo3904implements("TOLY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.42
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTOLY(c16151e, i);
            }
        });
        ad.mo3904implements("TOPE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.41
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTOPE(c16151e, i);
            }
        });
        ad.mo3904implements("TORY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.40
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTORY(c16151e, i);
            }
        });
        ad.mo3904implements("TOWN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.39
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTOWN(c16151e, i);
            }
        });
        ad.mo3904implements("TPE1", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.38
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPE1(c16151e, i);
            }
        });
        ad.mo3904implements("TPE2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.37
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPE2(c16151e, i);
            }
        });
        ad.mo3904implements("TPE3", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.36
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPE3(c16151e, i);
            }
        });
        ad.mo3904implements("TPE4", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.35
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPE4(c16151e, i);
            }
        });
        ad.mo3904implements("TPOS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.34
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPOS(c16151e, i);
            }
        });
        ad.mo3904implements("TPRO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.33
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPRO(c16151e, i);
            }
        });
        ad.mo3904implements("TPUB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.32
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTPUB(c16151e, i);
            }
        });
        ad.mo3904implements("TRCK", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.31
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTRCK(c16151e, i);
            }
        });
        ad.mo3904implements("TRDA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.30
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTRDA(c16151e, i);
            }
        });
        ad.mo3904implements("TRSN", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.29
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTRSN(c16151e, i);
            }
        });
        ad.mo3904implements("TRSO", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.28
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTRSO(c16151e, i);
            }
        });
        ad.mo3904implements("TSIZ", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.27
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSIZ(c16151e, i);
            }
        });
        ad.mo3904implements("TSO2", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.26
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSO2(c16151e, i);
            }
        });
        ad.mo3904implements("TSOA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.25
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSOA(c16151e, i);
            }
        });
        ad.mo3904implements("TSOC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.24
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSOC(c16151e, i);
            }
        });
        ad.mo3904implements("TSOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.23
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSOP(c16151e, i);
            }
        });
        ad.mo3904implements("TSOT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.22
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSOT(c16151e, i);
            }
        });
        ad.mo3904implements("TSRC", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.21
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSRC(c16151e, i);
            }
        });
        ad.mo3904implements("TSSE", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.20
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSSE(c16151e, i);
            }
        });
        ad.mo3904implements("TSST", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.19
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTSST(c16151e, i);
            }
        });
        ad.mo3904implements("TXXX", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.18
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTXXX(c16151e, i);
            }
        });
        ad.mo3904implements("TYER", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.17
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTYER(c16151e, i);
            }
        });
        ad.mo3904implements("UFID", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.16
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyUFID(c16151e, i);
            }
        });
        ad.mo3904implements("USER", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.15
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyUSER(c16151e, i);
            }
        });
        ad.mo3904implements("USLT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.14
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyUSLT(c16151e, i);
            }
        });
        ad.mo3904implements("WCOM", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.13
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWCOM(c16151e, i);
            }
        });
        ad.mo3904implements("WCOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.12
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWCOP(c16151e, i);
            }
        });
        ad.mo3904implements("WOAF", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.11
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWOAF(c16151e, i);
            }
        });
        ad.mo3904implements("WOAR", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.10
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWOAR(c16151e, i);
            }
        });
        ad.mo3904implements("WOAS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.9
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWOAS(c16151e, i);
            }
        });
        ad.mo3904implements("WORS", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.8
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWORS(c16151e, i);
            }
        });
        ad.mo3904implements("WPAY", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.7
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWPAY(c16151e, i);
            }
        });
        ad.mo3904implements("WPUB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.6
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWPUB(c16151e, i);
            }
        });
        ad.mo3904implements("WXXX", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.5
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyWXXX(c16151e, i);
            }
        });
        ad.mo3904implements("XSOA", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.4
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyXSOA(c16151e, i);
            }
        });
        ad.mo3904implements("XSOP", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.3
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyXSOP(c16151e, i);
            }
        });
        ad.mo3904implements("XSOT", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.2
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyXSOT(c16151e, i);
            }
        });
        ad.mo3904implements("TALB", new Id3FrameBodyFactory() { // from class: ealvatag.tag.id3.framebody.Id3FrameBodyFactories.1
            @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
            public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
                return new FrameBodyTALB(c16151e, i);
            }
        });
        this.factoryMap = ad.smaato();
    }

    public static Id3FrameBodyFactory instance() {
        if (instance == null) {
            synchronized (Id3FrameBodyFactories.class) {
                try {
                    if (instance == null) {
                        instance = new Id3FrameBodyFactories();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @Override // ealvatag.tag.id3.framebody.Id3FrameBodyFactory
    public AbstractID3v2FrameBody make(String str, C16151e c16151e, int i) {
        Id3FrameBodyFactory id3FrameBodyFactory = (Id3FrameBodyFactory) this.factoryMap.get(str);
        if (id3FrameBodyFactory != null) {
            return id3FrameBodyFactory.make(str, c16151e, i);
        }
        throw new FrameIdentifierException(str);
    }
}
